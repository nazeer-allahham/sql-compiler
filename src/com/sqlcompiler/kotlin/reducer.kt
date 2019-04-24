package com.sqlcompiler.kotlin

import java.io.File

object Reducer {

    fun reduce(directory: File,
               sources: ArrayList<String>,
               desiredColumns: ArrayList<String>) {
        var header: Row? = null
        var rows: ArrayList<Row> = ArrayList()

        sources.forEach { source ->
            val (h, rows1) = Handler.readFromFile(source) as Pair<Row, ArrayList<Row>>
            if (header == null)
                header = h
            rows.addAll(rows1)
        }

        val columns: ArrayList<Int> = header!!.filter(desiredColumns)

        header = header!!.map(columns)
        rows = rows.map { row -> row.map(columns) } as ArrayList<Row>
        Handler.writeToFile(directory.path + File.separator + "reducer.csv", header!!, rows)
        ExecutionPlan.addStep("Reducer", "")
    }
}