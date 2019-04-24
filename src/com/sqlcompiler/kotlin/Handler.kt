package com.sqlcompiler.kotlin

import com.github.keelar.exprk.Expressions
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sqlcompiler.Environment
import com.sqlcompiler.java.DataType
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.math.BigDecimal
import java.util.HashMap
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

object Handler {
    fun writeToFile(path: String, header: Row, data: ArrayList<Row>) {
        val file = File(path)
        if (!file.exists())
            file.createNewFile()
        val writer = FileWriter(file)

        writer.append(header.toString())
        data.forEach { row -> writer.append(row.toString()) }
        writer.close()
    }

    fun readFromFile(path: String): Pair<Row, ArrayList<Row>>? {
        val file = File(path)
        if (!file.exists()) {
            Console.error("File doesn't exist <$path>")
        } else {
            var header: Row? = null
            val rows = ArrayList<Row>()
            FileReader(file).readLines().forEachIndexed { index, row ->
                val fields = row.split(",")

                if (index == 0) {
                    header = Row()
                    fields.forEach { field -> header?.addField(field) }
                } else {
                    rows.add(Row(fields as ArrayList<String>))
                }
            }
            return header!! to rows
        }
        return null
    }

    fun dataType2Table(dataType: DataType): Table {
        val cols = ArrayList<Column>()
        dataType.fields.forEach { field ->
            cols.add(Column(field.name, field.type))
        }

        val locations = ArrayList<String>()
        dataType.locations.forEach { location ->
            locations.add(location)
        }
        return Table(dataType.name, cols, locations)
    }

    fun createTable(table: Table) {
        table.locations.forEach { location ->
            val file = File(location)

            if (file.exists()) {
                Console.log("Failed to execute create table file <File is already exist>")
                return
            }

            if (!file.createNewFile()) {
                Console.log("Failed to execute create table file <Cannot use table url>")
                return
            }

            val writer = FileWriter(file)

            table.columns.forEachIndexed { i, column ->
                writer.append(column.name.plus(if (i == table.columns.size - 1) '\n' else ','))
            }
            writer.close()
        }
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

        Console.output(header, rows)
    }

    fun select1(names: ArrayList<String>,
                conditions: Pair<String, ArrayList<String>>,
                desiredColumns: ArrayList<String>,
                orderBy: ArrayList<String>) {
        val directory = File(Environment.OUTPUT_FILE_NAME)
        directory.mkdirs()

        val tables = restoreTables(names)
        Reducer.reduce(directory, Shuffler.shuffle(directory, orderBy, Mapper.map(directory, tables[0], conditions)), desiredColumns)
    }

    private fun restoreTables(names: ArrayList<String>): List<Table> {
        val type = object : TypeToken<java.util.HashMap<String, DataType>>() {}.type
        val types: HashMap<String, DataType> = Gson().fromJson(FileReader(Environment.DATA_TYPES_PATH), type)

        val tables = ArrayList<Table>()
        types.values.forEach {
            tables.add(dataType2Table(it))
        }
        return tables.filter { table -> names.contains(table.name) }
    }

    fun getRowStatus(header: Row, row: Row, condition: String, params: ArrayList<String>): Boolean {
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

    fun readTable(table: Table): Pair<Row, ArrayList<Row>> {
        var header: Row? = null
        val rows = ArrayList<Row>()

        table.locations.forEach { location ->
            val file = File(location)
            if (!file.exists()) {
                Console.log("Table <${table.name}> doesn't exist!")
                exitProcess(1)
            }

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
        }

        return Pair(header as Row, rows)
    }
}