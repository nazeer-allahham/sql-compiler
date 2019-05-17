package com.sqlcompiler.kotlin

import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.util.HashMap
import kotlin.collections.ArrayList

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

    fun writeToFile(path: String, header: Row, data: HashMap<String, Row>) {
        val file = File(path)
        if (!file.exists())
            file.createNewFile()
        val writer = FileWriter(file)

        writer.append(header.toString())
        data.values.forEach { row -> writer.append(row.toString()) }
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
                    rows.add(Row(fields.filter { true } as ArrayList<String>))
                }
            }
            return header!! to rows
        }
        return null
    }

    fun createTable(table: Table, rows: ArrayList<Row>? = null): Table? {
        table.locations.forEach { location ->
            val file = File(location)

            if (file.exists()) {
                Console.log("Failed to execute create table file <File is already exist>")
                return null
            }

            if (!file.createNewFile()) {
                Console.log("Failed to execute create table file <Cannot use table url>")
                return null
            }
        }

        val writer = FileWriter(File(table.locations.first()))
        table.columns.forEachIndexed { i, column ->
            writer.append(column.name.plus(if (i == table.columns.size - 1) '\n' else ','))
        }
        rows?.forEach { row ->
            writer.append("$row")
        }
        writer.close()

        Console.log("Table created successfully")
        return table
    }

    /*
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
    */

    fun select(table: Any,
               columns: ArrayList<DesiredColumn>,
               wheres: ArrayList<Pair<String, ArrayList<Condition>>>,
               join: ArrayList<Join>,
               groupBy: ArrayList<String>,
               orderBy: ArrayList<String>,
               combine: Pair<String, ArrayList<Row>> = Pair("", arrayListOf()),
               distinct: Boolean,
               purpose: Int): Any {
        ExecutionPlan.addStep("Query Execution Plan", "Start the process")

        var condition = ""
        val definitions = arrayListOf<Condition>()

        wheres.forEach { i ->
            condition += i.first
            definitions.addAll(i.second)
        }
        val result = Reducer.reduce(
                Shuffler.shuffle(
                        Mapper.map(
                                Fetcher.fetch(Utils.createDirectory(),
                                        table,
                                        columns,
                                        condition to definitions,
                                        join,
                                        groupBy,
                                        orderBy,
                                        combine,
                                        distinct,
                                        purpose))))
        Console.log(result.first, "${result.second}")
        ExecutionPlan.addStep("Query Execution Plan", "End of the process")
        return result.second
    }
}