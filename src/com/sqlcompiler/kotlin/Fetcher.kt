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
              orderBy: ArrayList<String>): Return {
        val result = Return()
        // These values will be used later from (Mapper, Shuffler, Reducer)
        result["directory"] = directory
        result["desired_columns"] = columns
        result["where_clause"] = where.first
        result["where_columns"] = where.second
        result["group_by"] = groupBy
        result["order_by"] = orderBy

        // values declared by Fetcher
        result["fetcher_files"] = ArrayList<String>()

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

        // Grouping the data
        var groups = HashMap<String, ArrayList<Row>>()
        groups["all"] = rows

        groupBy.forEach { term ->
            groups = this.groupBy(header.find(term), groups)
        }

        // Save the groups into separated files
        groups.keys.forEach { key ->
            val path = directory.path + File.separator + "fetch_$key.csv"
            Handler.writeToFile(path, header, groups[key]!!)
            (result["fetcher_files"] as ArrayList<String>).add(path)
        }

        // Schedule mapping process for each grouping function (one mapper if there is no grouping functions)
        if (groupBy.isNotEmpty()) {
            result["mapper_jobs"] = columns.filter { column -> column.hasGroupingFunction() }
        }
        if (!result.containsKey("mapper_jobs")) // if group by was empty
        {
            result["mapper_jobs"] = ArrayList<DesiredColumn>()
        }
        (result["mapper_jobs"] as ArrayList<DesiredColumn>).add(DesiredColumn("_", "_"))

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