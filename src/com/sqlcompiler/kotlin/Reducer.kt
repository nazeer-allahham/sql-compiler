package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File

object Reducer {

    fun basicReduce(directory: File,
                    sources: ArrayList<String>,
                    desiredColumns: ArrayList<DesiredColumn>): Pair<String, String> {
        var header: Row? = null
        var rows: ArrayList<Row> = ArrayList()

        sources.forEach { source ->
            val (h, rows1) = Handler.readFromFile(source) as Pair<Row, ArrayList<Row>>
            if (header == null)
                header = h
            rows.addAll(rows1)
        }

        if (desiredColumns.size > 0) {
            val columns: ArrayList<Int> = header!!.filter(desiredColumns)
            header = header!!.map(columns)
            rows = rows.map { row -> row.map(columns) } as ArrayList<Row>
        }

        Handler.writeToFile(directory.path + File.separator + "reducer.csv", header!!, rows)
        ExecutionPlan.addStep("Basic Reducer", "Do you love me?")

        return if (header!!.fields.size == 1) {
            return if (rows.size == 1) {
                "value" to rows[0].fields[0]
            } else {
                var res = ""
                rows.forEachIndexed { index, row ->
                    res = res.plus(row.fields[0] + if (index != rows.size - 1) "," else "")
                }
                "array" to res
            }
        } else {
            val columns = ArrayList<Column>()
            header!!.fields.forEach { field ->
                columns.add(Column(field.split("_")[1], ""))
            }
            Handler.createTable(Table("TEMPORARY", columns, arrayListOf(Environment.TABLES_PATH + "TEMPORARY.csv"), ","))
            "table" to "TEMPORARY"
        }
    }

    fun groupByReduce(directory: File,
                      sources: ArrayList<String>,
                      desiredColumns: ArrayList<DesiredColumn>): Pair<String, String> {
        var header: Row? = null
        var rows: ArrayList<Row> = ArrayList()

        sources.forEach { source ->
            val (h, rows1) = Handler.readFromFile(source) as Pair<Row, ArrayList<Row>>
            if (header == null)
                header = h

            if (desiredColumns.size > 0) {
                val columns: ArrayList<Int> = header!!.filter(desiredColumns)
                header = header!!.map(columns)

                val row = Row()
                desiredColumns.forEachIndexed { index, value ->
                    when (value.functionName) {
                        "min" -> {
                            row.addField(rows1.minBy { f -> f.fields[index] }!!.fields[index])
                        }
                    }
                }
                rows.add(row)
            }
        }

        Handler.writeToFile(directory.path + File.separator + "reducer.csv", header!!, rows)
        ExecutionPlan.addStep("Reducer", "Do you Do you")

        return if (header!!.fields.size == 1 && rows.size == 1) "value" to rows[0].fields[0] else "table" to ""
    }
}