package com.sqlcompiler.kotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class mapper {

    /**
     * @param path:  path of the file which want to map it's content
     * @return true if the process completed successfully else return false
     **/
    fun run(path: String): Boolean {
        var reader: BufferedReader? = null
        try {
            reader = BufferedReader(FileReader(File(path)))
            var row: String
            do {
                row = reader.readLine()

                val columns: List<String> = row.split('\t')
                if (columns.size == 3) {
                    println("${columns[0]}\t${columns[1]}")
                }
            }while (row.isNotEmpty())

        }catch (ex: Exception) {
            return false
        }finally {
            reader?.close()
        }
        return true
    }
}