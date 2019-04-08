package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File
import java.io.FileWriter
import java.util.*
import kotlin.math.min

object Console {
    private const val width = 90
    private val errors = ArrayList<String>()

    fun log(vararg messages: String) {
        divider()

        for (message in messages) {
            var i = 0
            while (i < message.length) {
                print(String.format("%c %s %c\n", '|', subString(message, i, width - 2, ' '), '|'))
                i = min(i + width - 4, message.length)
            }
        }

        divider()
    }

    fun error(err: String) {
        this.errors.add(err)
    }

    fun flushErrors() {
        if (errors.isEmpty())
            return
        divider()
        for (error in errors) {
            var i = 0
            while (i < error.length) {
                print(String.format("%c %s %c\n", '|', subString(error, i, width - 2, ' '), '|'))
                i = min(i + width - 4, error.length)
            }
        }
        this.errors.clear()
        divider()
    }

    private fun divider() {
        print('+')
        for (i in 0 until width)
            print('-')
        println('+')
    }

    private fun subString(message: String, start: Int, length: Int, complete: Char): String {
        var subMessage = message.substring(start, min(start + length, message.length))
        while (subMessage.length < length)
            subMessage = subMessage.plus(complete)
        return subMessage
    }

    fun showOutput(header: Row, rows: MutableList<Row>) {
        if (rows.size == 0) {
            log("0 row affected.")
        } else {
            val file = File(Environment.OUTPUT + "output_${Date().toLocaleString().replace(Regex("[-: ]"), "_")}.csv")
            file.createNewFile()
            val writer = FileWriter(file)

            // Printing the header
            // TODO delete table name from header fields
            header.fields.forEachIndexed { index, field -> writer.append("$field ${if (index == header.fields.size - 1) "\n" else ","}") }
            // Printing the rows
            for (i in 0 until rows.size) {
                rows[i].fields.forEachIndexed { index, field -> writer.append("$field ${if (index == rows[0].fields.size - 1) "\n" else ","}") }
            }
            log("${rows.size} rows affected.")
            writer.close()
        }
    }
}