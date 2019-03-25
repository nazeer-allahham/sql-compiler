package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

object Handler {
    fun createFile(fileName: String, vararg columns: String) {
        val file = File(Environment.TABLES_PATH + fileName)
        if (file.exists()) {
            print("File is already existed!")
        }
        file.createNewFile()
        val writer = BufferedWriter(FileWriter(file))
        for (i in 0 until (columns.size)) {
            writer.append(columns[i])
            if (i < columns.size - 1)
                writer.append(",")
        }
        writer.newLine()
        writer.close()
    }

    fun handleSelect() {
        println("asdadads")
    }
}