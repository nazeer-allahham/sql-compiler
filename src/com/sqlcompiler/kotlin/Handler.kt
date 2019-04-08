package com.sqlcompiler.kotlin

import com.github.keelar.exprk.Expressions
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.math.BigDecimal
import kotlin.system.exitProcess

object Handler {
    fun createTable(table: Table) {
        val file = File(table.location)

        if (file.exists()) {
            Console.log("Failed to execute create table statement <File is already exist>")
            return
        }

        if (!file.createNewFile()) {
            Console.log("Failed to execute create table statement <Cannot use table url>")
            return
        }

        val writer = FileWriter(file)

        table.columns.forEachIndexed { i, column ->
            writer.append(column.title.plus(if (i == table.columns.size - 1) '\n' else ','))
        }

        writer.close()
        Console.log("Table created successfully")
    }

    fun select(tables: ArrayList<Table>,
               condition: Pair<String, ArrayList<String>>) {
        var (header, rows) = this.readTable(tables[0])

        if (tables.size > 1) {
            for (i in 1 until tables.size) {
                val j = this.joinTable(rows, tables[i])
                header.addFields(j.first.fields)
                rows = j.second
            }
        }
        rows = rows.filter { row -> getRowStatus(header, row, condition.first, condition.second) } as ArrayList<Row>

        Console.showOutput(header, rows)
        Console.flushErrors()
    }

    private fun getRowStatus(header: Row, row: Row, condition: String, params: ArrayList<String>): Boolean {
        var expr = Expressions()
        params.forEach { param ->
            expr = expr.define(param, row.fields[header.find(param)])
        }
        return expr.eval(condition) != BigDecimal(0)
    }

    private fun joinTable(rows: ArrayList<Row>, table: Table): Pair<Row, ArrayList<Row>> {
        val result = ArrayList<Row>()
        val (header2, rows2) = this.readTable(table)

        rows.forEach { row ->
            rows2.forEach { row2 ->
                val nRow = Row()
                nRow.addFields(row.fields)
                nRow.addFields(row2.fields)
                result.add(nRow)
            }
        }
        return header2 to result
    }

    private fun readTable(table: Table): Pair<Row, ArrayList<Row>> {
        val file = File(table.location)
        if (!file.exists()) {
            Console.log("Table <${table.name}> doesn't exist!")
            exitProcess(1)
        }

        var header: Row? = null
        val rows = ArrayList<Row>()

        FileReader(file).readLines().forEachIndexed { index, row ->
            val fields = row.split(",")

            if (fields.size != table.columns.size) {
                Console.error("Error: Fields count of row=$index from table=${table.name} is not as the expected!")
                return@forEachIndexed
            }

            if (index == 0) {
                header = Row()
                fields.forEach { field -> header?.addField(table.name + "_" + field) }
            } else {
                rows.add(Row(fields as ArrayList<String>))
            }
        }
        return Pair(header as Row, rows)
    }
}