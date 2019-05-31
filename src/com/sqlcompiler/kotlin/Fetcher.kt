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
              table: Any,
              columns: ArrayList<DesiredColumn>,
              where: Pair<String, ArrayList<Condition>>,
              joins: ArrayList<Join>,
              groupBy: ArrayList<String>,
              orderBy: ArrayList<String>,
              combine: Pair<String, ArrayList<Row>> = Pair("", arrayListOf()),
              distinct: Boolean,
              purpose: Int): Return {

        ExecutionPlan.addStep("Fetcher", "Start fetching process")
        val names = joins.map { j -> j.tableName } as ArrayList<String>

        names.add(0, if (table is String) table else (table as Table).name)
        val tables = restoreTables(names, if (table is Table) table else null)

        val result = Return()
        // These values will be used later from (Mapper, Shuffler, Reducer)
        result["directory"] = directory
        result["table"] = table
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
            rows = filter(j.second, header, join.condition, join.definitions)
        }

        // Handle row functions
        columns.forEach { column ->
            if (column.transforms.isNotEmpty()) {
                Console.log("Transform is not empty")
                val index = header.find(column.columnName)
                rows.forEach { row ->
                    column.transforms.forEach { transform ->
                        when (transform.name.toLowerCase()) {
                            "upper" -> {
                                row.fields[index] = row.fields[index].toUpperCase()
                            }
                            "lower" -> {
                                row.fields[index] = row.fields[index].toLowerCase()
                            }
                            "abs" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.abs(value.toDouble()).toString()
                            }
                            "acos" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.acos(value.toDouble()).toString()
                            }
                            "asin" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.abs(value.toDouble()).toString()
                            }
                            "atan2" -> {
                                val value1 =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else transform.params[0]
                                val value2 =
                                        if (transform.params[1].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[1])]
                                        else transform.params[1]
                                row.fields[index] = Math.atan2(value1.toDouble(), value2.toDouble()).toString()
                            }
                            "bitand" -> {

                            }
                            "ceil" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.ceil(value.toDouble()).toString()
                            }
                            "cos" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.cos(value.toDouble()).toString()
                            }
                            "cosh" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.cosh(value.toDouble()).toString()
                            }
                            "exp" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.exp(value.toDouble()).toString()
                            }
                            "floor" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.floor(value.toDouble()).toString()
                            }
                            "ln" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.log(value.toDouble()).toString()
                            }
                            "log" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.log(value.toDouble()).toString()
                            }
                            "mod" -> {
                                val value1 =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else transform.params[0]
                                val value2 =
                                        if (transform.params[1].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[1])]
                                        else transform.params[1]
                                row.fields[index] = Math.floorMod(value1.toInt(), value2.toInt()).toString()
                            }
                            "nanvl" -> {

                            }
                            "power" -> {
                                val value1 =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else transform.params[0]
                                val value2 =
                                        if (transform.params[1].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[1])]
                                        else transform.params[1]
                                row.fields[index] = Math.pow(value1.toDouble(), value2.toDouble()).toString()
                            }
                            "remainder" -> {

                            }
                            "round" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.round(value.toDouble()).toString()
                            }
                            "sign" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.signum(value.toDouble()).toString()
                            }
                            "sin" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.sin(value.toDouble()).toString()
                            }
                            "sinh" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.sinh(value.toDouble()).toString()
                            }
                            "sqrt" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.sqrt(value.toDouble()).toString()
                            }
                            "tan" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.tan(value.toDouble()).toString()
                            }
                            "tanh" -> {
                                val value: String =
                                        if (transform.params[0].startsWith("[A-Za-z]"))
                                            row.fields[header.find(transform.params[0])]
                                        else
                                            transform.params[0]
                                row.fields[index] = Math.tanh(value.toDouble()).toString()
                            }
                            "trunc" -> {

                            }
                            "width_bucket" -> {

                            }
                            "type_cast" -> {
                                val value1 = row.fields[header.find(transform.params[0])].toDouble()
                                val value2 = transform.params[1]
                                when (value2.toLowerCase()) {
                                    "int" -> row.fields[header.find(transform.params[0])] = value1.toInt().toString()
                                    "float" -> row.fields[header.find(transform.params[0])] = value1.toFloat().toString()
                                    "double" -> row.fields[header.find(transform.params[0])] = value1.toDouble().toString()
                                }
                            }
                        }
                    }
                }
            }
        }

        // Eliminate rows which are not compatible with where condition
        rows = filter(rows, header, where.first, where.second)

        // Files created by fetcher
        result["fetcher_files"] = ArrayList<String>()

        val path = directory.path + File.separator + "fetch.csv"
        Handler.writeToFile(path, header, rows)
        ExecutionPlan.addStep("Fetcher create file", "add the chosen data to the new file: $path")
        (result["fetcher_files"] as ArrayList<String>).add(path)

        ExecutionPlan.addStep("Fetcher", "done fetching process")
        return result
    }

    private fun filter(rows: ArrayList<Row>, header: Row, where: String, definitions: ArrayList<Condition>): ArrayList<Row> {
        if (where.isEmpty() || definitions.isEmpty()) {
            return rows
        }
        ExecutionPlan.addStep("Filter Rows", "Eliminate rows which are not compatible with where condition")
        return rows.filter { row ->
            getRowStatus(header, row, where, definitions)
        } as ArrayList<Row>
    }

    private fun groupBy(index: Int, groups: HashMap<String, ArrayList<Row>>): HashMap<String, ArrayList<Row>> {
        val map = HashMap<String, ArrayList<Row>>()
        ExecutionPlan.addStep("Fetcher group by", "Start Grouping")
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

    private fun firstORsecond(first: String, second: String): String {
        return when {
            first.matches(Regex("[A-Za-z ][A-Za-z_ ]*")) -> second
            second.matches(Regex("[\"'][\\w]*['\"]")) -> first.substring(0, first.length - 1)
            second == "" -> first
            else -> first
        }
    }

    private fun getRowStatus(header: Row, row: Row, condition: String, params: ArrayList<Condition>): Boolean {
        var expr = Expressions()
        params.forEach { param ->
            val left: String = firstORsecond(param.left, row.get(header.find(param.left)))
            val right: String = firstORsecond(param.right, row.get(header.find(param.right)))
            val res: Boolean

            if (param.type == "string") {
                res = when (param.operator) {
                    "<" -> left.compareTo(right) == -1
                    ">" -> right.compareTo(left) == -1
                    "==" -> left.compareTo(right) == 0
                    ">=" -> right.compareTo(left) == -1 || left.compareTo(right) == 0
                    "<=" -> left.compareTo(right) == -1 || left.compareTo(right) == 0
                    "=" -> left.compareTo(right) == 0
                    "!=" -> left.compareTo(right) != 0
                    else -> false
                }
            } else {
                res = when (param.operator) {
                    "<" -> left.toDouble() < right.toDouble()
                    ">" -> left.toDouble() > right.toDouble()
                    "==" -> left.toDouble() == right.toDouble()
                    ">=" -> left.toDouble() >= right.toDouble()
                    "<=" -> left.toDouble() <= right.toDouble()
                    "=" -> left.toDouble() == right.toDouble()
                    "!=" -> left.toDouble() != right.toDouble()
                    else -> false
                }
            }
            expr = expr.define(param.variable, BigDecimal(if (res) 1 else 0))
        }
        return if (condition.isNotEmpty()) expr.eval(condition) != BigDecimal(0) else true
    }

    private fun joinTable(distinct: Boolean, header1: Row, rows1: ArrayList<Row>, table: Table, join: Join): Pair<Row, ArrayList<Row>> {
        val (header2, rows2) = readTable(table, distinct)
        val header = header1.concatenate(header2)
        val result = ArrayList<Row>()

        val indexes = header.filterStrings(join.definitions.map { definition -> definition.left } as ArrayList<String>)
        val m = ArrayList<Row>()

        ExecutionPlan.addStep("Fetcher Joining", "Joining Tables")
        rows1.forEach { row1 ->
            rows2.forEach { row2 ->
                val row = row1.concatenate(row2)
                if (getRowStatus(header, row, join.condition, join.definitions)) {
                    result.add(row)
                    m.add(row.map(indexes))
                }
            }
        }

        if (join.type == "fullouterjoin" || join.type == "leftouterjoin") {
            val ids = header1.filterStrings(join.definitions.map { definition -> definition.left } as ArrayList<String>)
            rows1.forEach { row ->
                if (m.find { row1 -> row1.contains(row, ids) } == null) {
                    result.add(row.concatenate(header2.fields.size, ""))
                }
            }
        }
        if (join.type == "fullouterjoin" || join.type == "rightouterjoin") {
            val ids = header2.filterStrings(join.definitions.map { definition -> definition.left } as ArrayList<String>)
            rows2.forEach { row ->
                if (m.indexOfFirst { row1 -> row.contains(row1, ids) } == -1) {
                    result.add(row.concatenate(header1.fields.size, "", 0))
                }
            }
        }
        return header to result
    }
}