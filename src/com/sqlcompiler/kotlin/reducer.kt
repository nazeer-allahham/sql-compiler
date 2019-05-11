package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File

object Reducer {

    fun reduce(_in: Return): Pair<String, String> {
        val header = Row()
        val rows = ArrayList<Row>()

        val flag = _in["grouping"] as Boolean
        val sources = _in["shuffler_files"] as ArrayList<String>
        val columns = _in["desired_columns"] as ArrayList<DesiredColumn>

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

            columns.forEach { column ->
                if (!column.hasGroupingFunction()) {
                    val index = h!!.find(column.columnName)
                    rows.forEachIndexed { i, row ->
                        row.addField(data!![i].fields[index])
                    }
                }
            }
        }

        Handler.writeToFile("${(_in["directory"] as File).path}${File.separator}reducer.csv", header, rows)

        return if (header.fields.size == 1) {
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
            val cols = ArrayList<Column>()
            header.fields.forEach { field ->
                cols.add(Column(field.replace(Regex("[(]"), "_").replace(Regex("[)]"), ""), ""))
            }
            "table" to Handler.createTable(Table("temp", cols, arrayListOf(Environment.TABLES_PATH + "temp.csv"), ","))
        }
    }
}