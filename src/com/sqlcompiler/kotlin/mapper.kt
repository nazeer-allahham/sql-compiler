package com.sqlcompiler.kotlin

import java.io.File

object Mapper {

    fun map(directory: File,
            table: Table,
            conditions: Pair<String, ArrayList<String>>): ArrayList<String> {
        val files: ArrayList<String> = ArrayList()

        var (header, rows) = Handler.readTable(table)

        rows = rows.filter { row -> Handler.getRowStatus(header, row, conditions.first, conditions.second) } as ArrayList<Row>

        files.add(directory.path + File.separator + "mapper.csv")
        Handler.writeToFile(files[0], header, rows)

        ExecutionPlan.addStep("Mapper", "read the rows")
        return files
    }
}