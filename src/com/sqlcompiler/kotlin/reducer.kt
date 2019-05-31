package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File
import kotlin.random.Random

object Reducer {
    const val PURPOSE_SELECT_NORMAL = 1
    const val PURPOSE_SELECT_FROM_SUBQUERY = 2
    const val PURPOSE_SELECT_WHERE_SUBQUERY = 4
    const val PURPOSE_SELECT_ONE_VALUE = 8
    const val PURPOSE_SELECT_COMBINE = 16
    const val PURPOSE_SELECT_RESULT = 32

    const val COMBINE_SELECT_UNION = "UNION"
    const val COMBINE_SELECT_UNION_ALL = "UNION ALL"
    const val COMBINE_SELECT_EXCEPT = "EXCEPT"
    const val COMBINE_SELECT_EXCEPT_ALL = "EXCEPT ALL"
    const val COMBINE_SELECT_INTERSECT = "INTERSECT"
    const val COMBINE_SELECT_INTERSECT_ALL = "INTERSECT ALL"

    fun reduce(_in: Return): Pair<String, Any> {
        val header = Row()
        var rows = ArrayList<Row>()

        val flag = _in["grouping"] as Boolean
        val sources = _in["shuffler_files"] as ArrayList<String>
        val columns = _in["desired_columns"] as ArrayList<DesiredColumn>

        ExecutionPlan.addStep("Reducer", "Begin Reducing")
        columns.forEach { column -> header.addField(column.title()) }

        if (!flag) {
            if (columns.size > 0) {
                sources.forEach { source ->
                    val (head, body) = Handler.readFromFile(source)!!
                    val indexes = head.filter(columns)
                    body.forEach { row ->
                        rows.add(row.map(indexes))
                    }
                }
            } else {
                sources.forEach { source ->
                    val (head, body) = Handler.readFromFile(source)!!
                    if (header.fields.size == 0) {
                        head.fields.forEach { field -> header.addField(field) }
                    }
                    body.forEach { row ->
                        rows.add(row)
                    }
                }
            }
        } else {
            var h: Row? = null
            var data: ArrayList<Row>? = null
            sources.forEachIndexed { i, source ->
                val (header1, rows1) = Handler.readFromFile(source)!!
                val index = header1.find("values")
                if (i == 0) {
                    h = header1
                    data = rows1
                    rows1.forEach { _ ->
                        rows.add(Row())
                    }
                }
                rows.forEachIndexed { i2, row ->
                    row.addField(rows1[i2].fields[index])
                }
            }

            columns.forEachIndexed { I, column ->
                if (!column.hasGroupingFunction()) {
                    val index = h!!.find(column.columnName)
                    rows.forEachIndexed { i, row ->
                        row.addField(I, data!![i].fields[index])
                    }
                }
            }
        }

        if (_in.containsKey("combine")) {
            val combine = _in["combine"] as Pair<String, ArrayList<Row>>
            val right = combine.second

            when (combine.first) {
                COMBINE_SELECT_UNION -> {
                    //val left = rows.toMutableList()
                    //rows.clear()
                    right.forEach { row ->
                        if ((row !in rows))
                            rows.add(row)
                    }
                }
                COMBINE_SELECT_UNION_ALL -> {
                    right.forEach { row ->
                        rows.add(row)
                    }
                }
                COMBINE_SELECT_EXCEPT -> {
                    val left = rows.toMutableList()
                    rows.clear()
                    left.forEach { row ->
                        if (row !in right && row !in rows)
                            rows.add(row)
                    }
                }
                COMBINE_SELECT_EXCEPT_ALL -> {
                    val left = rows.toMutableList()
                    rows.clear()
                    left.forEach { row ->
                        if (row !in right)
                            rows.add(row)
                    }
                }
                COMBINE_SELECT_INTERSECT -> {
                    val left = rows.toMutableList()
                    rows.clear()
                    left.forEach { row ->
                        if (row in right && row !in rows)
                            rows.add(row)
                    }
                }
                COMBINE_SELECT_INTERSECT_ALL -> {
                    val left = rows.toMutableList()
                    rows.clear()
                    left.forEach { row ->
                        if (row in right)
                            rows.add(row)
                    }
                }
            }
        }


        columns.forEachIndexed { i, column ->
            if (column.isDistinct())
                rows = makeColumnDistinct(rows, i)
        }

        Handler.writeToFile("${(_in["directory"] as File).path}${File.separator}reducer.csv", header, rows)
        ExecutionPlan.addStep("Reducer", "End of Reducing")

        return when (_in["purpose"] as Int) {
            PURPOSE_SELECT_NORMAL -> {
                "DONE" to "${rows.size} row(s) affected."
            }
            PURPOSE_SELECT_FROM_SUBQUERY -> {
                val cols = ArrayList<Column>()
                header.fields.forEach { field ->
                    cols.add(Column(field.replace(Regex("[(]"), "_").replace(Regex("[)]"), ""), ""))
                }

                val tableID = Math.abs(Random(100).nextInt())
                "TABLE" to
                        Handler.createTable(
                                Table("temp_$tableID",
                                        cols,
                                        arrayListOf(Environment.TABLES_PATH + "temp_$tableID.csv"), "\t"), rows) as Table
            }
            PURPOSE_SELECT_WHERE_SUBQUERY -> {
                var res = ""
                rows.forEachIndexed { index, row ->
                    res = res.plus(row.fields[0] + if (index != rows.size - 1) "," else "")
                }
                "ARRAY" to res
            }
            PURPOSE_SELECT_ONE_VALUE -> {
                "SINGLE_VALUE" to rows[0].fields[0]
            }
            PURPOSE_SELECT_COMBINE -> {
                "COMBINE" to rows
            }
            PURPOSE_SELECT_RESULT -> {
                "RESULT" to rows
            }
            else -> {
                "BUG" to "Unknown purpose"
            }
        }

    }

    private fun makeColumnDistinct(rows: ArrayList<Row>, id: Int): ArrayList<Row> {
        val res = ArrayList<Row>()
        val toggle = HashSet<String>()

        rows.forEach { row ->
            val key = row.fields[id]
            if (!toggle.contains(key)) {
                res.add(row)
                toggle.add(key)
            }
        }
        return res
    }
}