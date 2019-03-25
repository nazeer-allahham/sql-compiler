package com.sqlcompiler.kotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class reducer {

    /**
     * @param path:  path of the file which want to reduce it's content
     * @return true if the process completed successfully else return false
     **/
    fun run(path: String): Boolean {
        var reader: BufferedReader? = null
        try {
            reader = BufferedReader(FileReader(File(path)))
            var row: String
            var previousKey = ""
            var sum = 0

            do {
                row = reader.readLine()

                val columns: List<String> = row.split('\t')

                // columns size must be 2 because the reducer just accept key value pairs
                if (columns.size != 2) {
                    continue
                }

                val currentKey = columns[0]
                val currentValue = columns[1]
                if (previousKey.isNotEmpty() && previousKey.compareTo(currentKey) == 0) {
                    println("$previousKey => $sum")
                    sum = 0
                }

                previousKey = currentKey
                sum += Integer.parseInt(currentValue)
            }while (row.isNotEmpty())

            if (previousKey.isNotEmpty()) {
                println("$previousKey => $sum")
            }

        }catch (ex: Exception) {
            return false
        }finally {
            reader?.close()
        }
        return true
    }
}