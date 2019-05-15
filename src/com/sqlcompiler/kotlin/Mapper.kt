package com.sqlcompiler.kotlin

import java.io.File

object Mapper {

    fun map(_in: Return): Return {

        val source = (_in["fetcher_files"] as ArrayList<String>)[0]
        val columns = _in["desired_columns"] as ArrayList<DesiredColumn>
        val keys = _in["group_by"] as ArrayList<String>

        val (header, rows) = Handler.readFromFile(source)!!

        val files = ArrayList<String>()

        // Mapper
        ExecutionPlan.addStep("Mapper", "start the Mapper")
        columns.forEach { column ->
            if (column.hasGroupingFunction()) {
                val indexes = ArrayList<Int>()
                val head = Row()
                val body = ArrayList<Row>()

                keys.forEach { key ->
                    head.addField(key)
                    indexes.add(header.find(key))
                }

                head.addField("function_name")
                head.addField("value")

                val index = header.find(column.columnName)

                rows.forEach { row ->
                    val row1 = Row()

                    indexes.forEach { index -> row1.addField(row.fields[index]) }
                    row1.addField(column.functionName)
                    row1.addField(row.fields[index])

                    body.add(row1)
                }

                val path = "${(_in["directory"] as File).path}${File.separator}map_${column.functionName}_${column.columnName}.csv"
                Handler.writeToFile(path, head, body)
                files.add(path)
            }
        }

        _in["mapper_files"] = files
        ExecutionPlan.addStep("Mapper", "End of the Mapper")
        return _in
    }
}