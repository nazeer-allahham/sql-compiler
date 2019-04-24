package com.sqlcompiler.kotlin

import java.io.File

object Mapper {

    fun map(directory: File,
            tables: List<Table>,
            conditions: Pair<String, ArrayList<String>>): ArrayList<String> {
        val files: ArrayList<String> = ArrayList()

        var (header, rows) = Handler.readTable(tables[0])

        if (tables.size > 1) {
            for (i in 1 until tables.size) {
                val j = Handler.joinTable(rows, tables[i])
                header.addFields(j.first.fields)
                rows = j.second
            }
        }

        rows = rows.filter { row -> Handler.getRowStatus(header, row, conditions.first, conditions.second) } as ArrayList<Row>

        files.add(directory.path + File.separator + "mapper.csv")
        Handler.writeToFile(files[0], header, rows)

        ExecutionPlan.addStep("Mapper", "read the rows")
        return files
    }
}