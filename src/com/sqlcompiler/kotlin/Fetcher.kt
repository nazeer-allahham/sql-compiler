package com.sqlcompiler.kotlin

import com.github.keelar.exprk.Expressions
import com.sqlcompiler.kotlin.Utils.readTable
import com.sqlcompiler.kotlin.Utils.restoreTables
import java.io.File
import java.math.BigDecimal

object Fetcher {
    /**
     * Fetch is a function if you know what i mean
     *
     * */
    fun fetch(directory: File,
              name: String,
              columns: ArrayList<DesiredColumn>,
              where: Pair<String, ArrayList<String>>,
              joins: ArrayList<Join>,
              groupBy: ArrayList<String>,
              orderBy: ArrayList<String>,
              combine: Pair<String, ArrayList<Row>> = Pair("", arrayListOf()),
              distinct: Boolean,
              purpose: Int): Return {

        val names = joins.map { j -> j.tableName } as ArrayList<String>
        names.add(0, name)
        val tables = restoreTables(names)

        val result = Return()
        // These values will be used later from (Mapper, Shuffler, Reducer)
        result["directory"] = directory
        result["name"] = name
        result["table"] = tables
        result["desired_columns"] = columns
        result["where_clause"] = where.first
        result["where_columns"] = where.second
        result["join"] = joins
        result["group_by"] = groupBy
        result["order_by"] = orderBy
        result["combine"] = combine
        result["distinct"] = distinct
        result["purpose"] = purpose

        var (header, rows) = readTable(tables[0], distinct)

        // in Join case
        joins.forEachIndexed { index, join ->
            val j = joinTable(distinct, header, rows, tables[index + 1], join)
            header = j.first
            rows = filter(j.second, header, join.condition, join.conditionColumns)
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
            getRowStatus(header, row, where, columns)
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

    private fun getRowStatus(header: Row, row: Row, condition: String, params: ArrayList<String>): Boolean {
        var expr = Expressions()
        params.forEach { param ->
            // TODO p here is set to "0" and that is wrong
            val p = row.fields[header.find(param)]
            if (p == "") return true
            expr = expr.define(param, p)
        }
        return if (condition.isNotEmpty()) expr.eval(condition) != BigDecimal(0) else true
    }

    private fun joinTable(distinct: Boolean, header1: Row, rows1: ArrayList<Row>, table: Table, join: Join): Pair<Row, ArrayList<Row>> {
        val (header2, rows2) = readTable(table, distinct)
        val header = header1.concatenate(header2)
        val result = ArrayList<Row>()

        val indexes = header.filterStrings(join.conditionColumns)
        val m = ArrayList<Row>()

        rows1.forEach { row1 ->
            rows2.forEach { row2 ->
                val row = row1.concatenate(row2)
                if (getRowStatus(header, row, join.condition, join.conditionColumns)) {
                    result.add(row)
                    m.add(row.map(indexes))
                }
            }
        }

        if (join.joinType == "FULL_OUTER" || join.joinType == "LEFT_OUTER") {
            val ids = header1.filterStrings(join.conditionColumns)
            rows1.forEach { row ->
                if (m.find { row1 -> row1.contains(row, ids) } == null) {
                    result.add(row.concatenate(header2.fields.size, ""))
                }
            }
        }
        if (join.joinType == "FULL_OUTER" || join.joinType == "RIGHT_OUTER") {
            val ids = header2.filterStrings(join.conditionColumns)
            rows2.forEach { row ->
                if (m.indexOfFirst { row1 -> row.contains(row1, ids) } == -1) {
                    result.add(row.concatenate(header1.fields.size, "", 0))
                }
            }
        }
        return header to result
    }
}