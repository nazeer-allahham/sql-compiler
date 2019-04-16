package com.sqlcompiler.kotlin

import java.io.File

object Shuffler {

    fun shuffle(directory: File,
                orderBy: ArrayList<String>,
                sources: ArrayList<String>): ArrayList<String> {
        val files: ArrayList<String> = ArrayList()

        var header: Row? = null
        var rows: ArrayList<Row> = ArrayList()

        sources.forEach { source ->
            val (h, rows1) = Handler.readFromFile(source) as Pair<Row, ArrayList<Row>>
            if (header == null)
                header = h
            rows.addAll(rows1)
        }

        rows = sort(rows, Comparator { o1, o2 -> compare(header!!, orderBy, o1, o2) })

        files.add(directory.path + File.separator + "shuffler.csv")
        Handler.writeToFile(files[0], header!!, rows)

        ExecutionPlan.addStep("Shuffler", "")
        return files
    }

    private fun compare(header: Row, orderBy: ArrayList<String>, o1: Row, o2: Row): Int {
        if (orderBy.size > 0) {
            orderBy.forEach { i ->
                val index = header.find(i)
                if (o1.fields[index].compareTo(o2.fields[index]) != 0)
                    return o1.fields[index].compareTo(o2.fields[index])
            }
        } else {
            o1.fields.forEachIndexed { i, _ ->
                if (o1.fields[i].compareTo(o2.fields[i]) != 0)
                    return o1.fields[i].compareTo(o2.fields[i])
            }
        }
        return 0
    }

    private fun sort(rows: ArrayList<Row>, comparator: Comparator<Row>): ArrayList<Row> {
        return rows.sortedWith(comparator).filter { true } as ArrayList<Row>
    }
}