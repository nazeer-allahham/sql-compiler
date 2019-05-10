package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File

object Reducer {

    fun reduce(_in: Return): Pair<String, String> {
        val header = Row()
        val rows = ArrayList<Row>()

        val columns = _in["desired_columns"] as ArrayList<DesiredColumn>

        var flag = false
        columns.forEach { column ->
            header.addField(column.fullName())
            flag = flag || column.hasGroupingFunction()
        }

        if (!flag) {
            val sources = _in["shuffler_data_files"] as ArrayList<String>
            val cols: ArrayList<Int> = header.filter(columns)
            sources.forEach { source ->
                val (_, rows1) = Handler.readFromFile(source)!!

                rows1.forEach { row1 ->
                    rows.add(row1.map(cols))
//                    rows.add(row1)
                }
            }
        } else {
            val groups = _in["shuffler_groups_files"] as ArrayList<String>
            groups.forEach { group ->
                val (header1, rows1) = Handler.readFromFile(group)!!
                rows1.forEach { row1 ->
                    val row = Row()
                    columns.forEach { column ->
                        if (column.hasGroupingFunction()) {
                            row.addField(row1.fields[2])
                        }
                    }
                    rows.add(row)
                }
            }

            val sources = _in["shuffler_data_files"] as ArrayList<String>
            sources.forEachIndexed { i, source ->
                val (header1, rows1) = Handler.readFromFile(source)!!

                columns.forEach { column ->
                    if (!column.hasGroupingFunction()) {
                        rows[i].fields.add(rows1[0].fields[header1.find(column.columnName)])
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
                cols.add(Column(field.split("_")[1], ""))
            }
            "table" to Handler.createTable(Table("temp", cols, arrayListOf(Environment.TABLES_PATH + "temp.csv"), ","))
        }
    }
}