package com.sqlcompiler.kotlin

import java.io.File

object Shuffler {

    fun shuffle(_in: Return): Return {

        val groups = _in["mapper_files"] as ArrayList<String>
        val orderBy = _in["order_by"] as ArrayList<String>

        val files: ArrayList<String> = ArrayList()

        if (groups.size > 0) {
            _in["grouping"] = true
            groups.forEach { group ->
                val (header, rows) = Handler.readFromFile(group)!!
                val head = Row()
                var body = HashMap<String, Row>()
                var title = ""

                // Find value because we named the value column with <value>
                val index = header.find("value")

                for (i in 0 until index) {
                    title += "${header.fields[i]}${if (i < index - 1) "_" else ""}"
                    head.addField(header.fields[i])
                }
                head.addField("key")
                head.addField("values")
                rows.forEach { row ->
                    Console.log(row.fields[index])
                    val row1 = Row()
                    // Generating the key
                    var key = ""
                    for (i in 0 until index) {
                        key += "${row.fields[i]}${if (i < index - 1) "_" else ""}"
                        row1.addField(row.fields[i])
                    }
                    row1.fields.add(key)

                    if (!body.containsKey(key)) {
                        body[key] = row1
                    }
                    body[key]!!.addField(row.fields[index])
                }

                val path = "${(_in["directory"] as File).path}${File.separator}shuffle_$title.csv"
                Handler.writeToFile(path, head, body)
                files.add(path)
            }
        } else {
            _in["grouping"] = false
            var (header, rows) = Handler.readFromFile((_in["fetcher_files"] as ArrayList<String>)[0])!!

            rows = sort(rows, Comparator { o1, o2 -> compare(header, orderBy, o1, o2) })

            val path = "${(_in["directory"] as File).path}${File.separator}shuffle_ordered_rows.csv"
            Handler.writeToFile(path, header, rows)
            files.add(path)
        }

        _in["shuffler_files"] = files
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