package com.sqlcompiler.kotlin

import java.io.File

object Reducer {

    fun basicReduce(directory: File,
                    sources: ArrayList<String>,
                    desiredColumns: ArrayList<DesiredColumn>) {
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
    }

    fun groupByReduce(directory: File,
                      sources: ArrayList<String>,
                      desiredColumns: ArrayList<DesiredColumn>) {
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
    }
}