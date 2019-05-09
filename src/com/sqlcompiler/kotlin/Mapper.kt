package com.sqlcompiler.kotlin

import java.io.File

object Mapper {

    fun map(directory: File,
            sources: List<String>,
            conditions: Pair<String, ArrayList<String>>): ArrayList<String> {
        val files: ArrayList<String> = ArrayList()

        var header: Row? = null
        var rows = ArrayList<Row>()

        sources.forEachIndexed { index, source ->
            val res = Handler.readFromFile(source)!!
            if (index == 0) {
                header = res.first
            }
            rows.addAll(res.second)
        }

        rows = rows.filter { row -> Handler.getRowStatus(header!!, row, conditions.first, conditions.second) } as ArrayList<Row>

        files.add(directory.path + File.separator + "Mapper.csv")
        Handler.writeToFile(files[0], header!!, rows)

        ExecutionPlan.addStep("Mapper", "read the rows")
        return files
    }
}