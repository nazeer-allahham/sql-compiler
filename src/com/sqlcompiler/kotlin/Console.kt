package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File
import java.io.FileWriter
import kotlin.math.min

object Console {
    private const val width = 90

    private val divider: String
        get() {
            val divider = StringBuilder()
            divider.append('+')
            for (i in 0 until width) divider.append('-')
            divider.append('+')
            return divider.toString()
        }

    fun log(vararg messages: String) {
        println(String.format("%s", divider))
        for (message in messages) {
            var i = 0
            while (i < message.length) {
                println(String.format("%c %s %c", '|', wrap(message, i, width - 2, ' '), '|'))
                i = min(i + width - 4, message.length)
            }
        }
        println(String.format("%s", divider))
    }

    fun error(err: String) {
        log("Error => $err")
    }

    private fun wrap(message: String, from: Int, length: Int, complete: Char): String {
        var msg: String = message.substring(from, min(from + length, message.length))
        while (msg.length < length)
            msg = msg.plus(complete)
        return msg
    }

    fun output(header: Row, rows: MutableList<Row>) {
        if (rows.size == 0) {
            log("0 row affected.")
        } else {
            val file = File(Environment.OUTPUT_FILE_NAME + ".csv")
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
            ExecutionPlan.draw("${file.parent}\\${file.nameWithoutExtension}")
        }
    }
}