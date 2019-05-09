package com.sqlcompiler.kotlin

import java.io.File

object Fetcher {
    fun fetch(directory: File,
              tables: List<Table>): List<String> {
        val files: ArrayList<String> = ArrayList()

        var (header, rows) = Handler.readTable(tables[0])

        if (tables.size > 1) {
            for (i in 1 until tables.size) {
                val j = Handler.joinTable(rows, tables[i])
                header.addFields(j.first.fields)
                rows = j.second
            }
        }

        files.add(directory.path + File.separator + "fetcher.csv")
        Handler.writeToFile(files[0], header, rows)

        return files
    }
}