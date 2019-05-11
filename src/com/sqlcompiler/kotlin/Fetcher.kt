package com.sqlcompiler.kotlin

import java.io.File

object Fetcher {
    /**
     * Fetch is a function if you know what i mean
     *
     * */
    fun fetch(directory: File,
              tables: List<Table>,
              columns: ArrayList<DesiredColumn>,
              where: Pair<String, ArrayList<String>>,
              groupBy: ArrayList<String>,
              orderBy: ArrayList<String>,
              combine: Pair<String, ArrayList<Row>> = Pair("", arrayListOf()),
              purpose: Int): Return {
        val result = Return()
        // These values will be used later from (Mapper, Shuffler, Reducer)
        result["directory"] = directory
        result["desired_columns"] = columns
        result["where_clause"] = where.first
        result["where_columns"] = where.second
        result["group_by"] = groupBy
        result["order_by"] = orderBy
        result["combine"] = combine
        result["purpose"] = purpose

        var (header, rows) = Handler.readTable(tables[0])

        // in Join case
        if (tables.size > 1) {
            for (i in 1 until tables.size) {
                val j = Handler.joinTable(rows, tables[i])
                header.addFields(j.first.fields)
                rows = j.second
            }
        }

        // Eliminate rows which are not compatible with where condition
        rows = filter(rows, header, where.first, where.second)

        // Files created by fetcher
        result["fetcher_files"] = ArrayList<String>()

        val path = directory.path + File.separator + "fetch.csv"
        Handler.writeToFile(path, header, rows)
        (result["fetcher_files"] as ArrayList<String>).add(path)

        return result
    }

    private fun filter(rows: ArrayList<Row>, header: Row, where: String, columns: ArrayList<String>): ArrayList<Row> {
        return rows.filter { row ->
            Handler.getRowStatus(header, row, where, columns)
        } as ArrayList<Row>
    }

    private fun groupBy(index: Int, groups: HashMap<String, ArrayList<Row>>): HashMap<String, ArrayList<Row>> {
        val map = HashMap<String, ArrayList<Row>>()
        groups.keys.forEach { i ->
            groups[i]!!.forEach { row ->
                val value = "${i}_${row.fields[index]}"
                if (!map.containsKey(value)) {
                    map[value] = ArrayList()
                }
                map[value]!!.add(row)
            }
        }
        return map
    }
}