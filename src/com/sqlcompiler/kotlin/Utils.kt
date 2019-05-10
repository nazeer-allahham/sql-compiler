package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.File

object Utils {
    fun smartSplit(column: String, result: String): String {
        val builder = StringBuilder(" && (")
        val split = result.split(",")
        split.forEachIndexed { index, r ->
            builder.append("$column == $r")
            if (index != split.size - 1) {
                builder.append(" || ")
            }
        }
        builder.append(") ")
        return builder.toString()
    }

    fun createDirectory(): File {
        val file = File(Environment.OUTPUT_FILE_NAME)
        file.mkdirs()
        return file
    }
}