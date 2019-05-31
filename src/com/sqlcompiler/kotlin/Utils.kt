package com.sqlcompiler.kotlin

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sqlcompiler.Environment
import com.sqlcompiler.java.DataType
import java.io.File
import java.io.FileReader
import java.util.HashMap
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

object Utils {
    private var splitUsage = 0

    fun smartSplit(columnName: String, columnType: String, result: String): Where {
        val condition = StringBuilder(" (")
        val definitions = ArrayList<Condition>()
        val split = result.split(",")

        ExecutionPlan.addStep("Utils Smart Split", "Splitting data")
        split.forEachIndexed { index, r ->
            condition.append("ssp$splitUsage")
            definitions.add(Condition("ssp$splitUsage", columnName, r, "=", columnType))
            if (index != split.size - 1) {
                condition.append(" || ")
            }
            splitUsage++
        }
        condition.append(") ")
        return Where(condition.toString(), definitions)
    }

    fun smartConcatenate(token: String, vararg strings: String): String {
        val builder = StringBuilder()

        ExecutionPlan.addStep("Utils Smart Concatenate", "Concatenating data")
        strings.forEachIndexed { index, string ->
            builder.append(string)
            if (index < strings.size - 1) {
                builder.append(token)
            }
        }
        return builder.toString()
    }

    fun createDirectory(): File {
        val file = File(Environment.OUTPUT_FILE_NAME)
        ExecutionPlan.addStep("Utils Create Directory", "Creating Directory")
        file.mkdirs()
        return file
    }

    fun restoreTables(names: List<String>, toAdd: Table?): List<Table> {
        val type = object : TypeToken<HashMap<String, DataType>>() {}.type
        val types: HashMap<String, DataType> = Gson().fromJson(FileReader(Environment.DATA_TYPES_PATH), type)
        val tables = ArrayList<Table>()

        ExecutionPlan.addStep("Utils Restore Tables", "Restoring Tables")
        if (toAdd is Table)
            tables.add(toAdd)
        types.values.forEach {
            tables.add(fromDataType2Table(it))
        }
        return tables.filter { table -> names.contains(table.name) }
    }

    private fun fromDataType2Table(type: DataType): Table {
        val cols = ArrayList<Column>()
        type.fields.forEach { field ->
            cols.add(Column(field.name, field.type))
        }

        val locations = ArrayList<String>()
        type.locations.forEach { location ->
            locations.add(location)
        }
        return Table(type.name, cols, locations, type.delimiter)
    }

    fun readTable(table: Table, distinct: Boolean): Pair<Row, ArrayList<Row>> {
        var header: Row? = null
        val rows = ArrayList<Row>()


        ExecutionPlan.addStep("Utils Read Table", "Reading Table")
        table.locations.forEach { location ->
            val file = File(location)
            if (!file.exists()) {
                Console.log("Table <${table.name}> doesn't exist!")
                exitProcess(1)
            }

            if (distinct) {
                FileReader(file).readLines().forEachIndexed { index, row ->
                    val fields = row.split(table.delimiter)

                    if (fields.size != table.columns.size) {
                        Console.error("Error: Fields count of row=$index from table=${table.name} is not as the expected!")
                        return@forEachIndexed
                    }

                    if (index == 0) {
                        header = Row()
                        fields.forEach { field -> header?.addField(table.name + "_" + field) }
                    } else {
                        val r = Row(fields as ArrayList<String>)
                        if (r !in rows)
                            rows.add(r)
                    }
                }
            } else {
                FileReader(file).readLines().forEachIndexed { index, row ->
                    val fields = row.split(table.delimiter)

                    if (fields.size != table.columns.size) {
                        Console.error("Error: Fields count of row=$index from table=${table.name} is not as the expected!")
                        return@forEachIndexed
                    }

                    if (index == 0) {
                        header = Row()
                        fields.forEach { field -> header?.addField(table.name + "_" + field) }
                    } else {
                        rows.add(Row(fields.filter { true } as ArrayList<String>))
                    }
                }
            }

        }

        return Pair(header as Row, rows)
    }
}