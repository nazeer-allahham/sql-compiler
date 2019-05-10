package com.sqlcompiler.kotlin

import java.io.File

object Shuffler {

    fun shuffle(_in: Return): Return {

        val data = _in["fetcher_files"] as ArrayList<String>
        val groups = _in["mapper_files"] as ArrayList<String>
        val orderBy = _in["order_by"] as ArrayList<String>

        val data_files: ArrayList<String> = ArrayList()
        val groups_files: ArrayList<String> = ArrayList()

        data.forEach { i ->
            var (header, rows) = Handler.readFromFile(i)!!

            rows = sort(rows, Comparator { o1, o2 -> compare(header, orderBy, o1, o2) })

            val key = i.substring(i.indexOf("fetch_") + 6, i.length - 4)
            val path = "${(_in["directory"] as File).path}${File.separator}shuffler_${key}_data.csv"
            Handler.writeToFile(path, header, rows)
            data_files.add(path)
        }

        groups.forEach { group ->
            val (header, rows) = Handler.readFromFile(group)!!
            if (rows.isNotEmpty()) {
                // rows[0].fields[1] is the name of the grouping function
                when (rows[0].fields[1]) {
                    "min" -> {
                        rows.forEachIndexed { i, row ->
                            var columns = row.splice(2, row.fields.size - 1)
                            Console.log("$columns")
                            columns = columns.sortedWith(Comparator { o1, o2 ->
                                o1.compareTo(o2)
                            }).filter { true } as ArrayList<String>
                            columns.add(0, row.fields[0])
                            columns.add(1, row.fields[1])

                            rows[i] = Row(columns)
                        }
                    }
                }
            }

            val key = group.substring(group.indexOf("mapper_"), group.length - 4)
            val path = "${(_in["directory"] as File).path}${File.separator}shuffler_${key}_group.csv"
            Handler.writeToFile(path, header, rows)
            groups_files.add(path)
        }

        _in["shuffler_data_files"] = data_files
        _in["shuffler_groups_files"] = groups_files
        return _in
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