package com.sqlcompiler.kotlin

import java.io.File

object Mapper {

    fun map(_in: Return): Return {

        val jobs = _in["mapper_jobs"] as ArrayList<DesiredColumn>
        val sources = _in["fetcher_files"] as ArrayList<String>

        val files = ArrayList<String>()

        jobs.forEach { job ->
            // If the job is default then there no need to do any thing
            // and the data we can read it from _in["fetcher_files"]
            // Else new file will be generated <key, values...>
            if (!job.isDefault()) {
                val head = Row(arrayListOf("key", "function_name", "values"))
                val body = ArrayList<Row>()
                sources.forEachIndexed { i, source ->
                    val (header, rows) = Handler.readFromFile(source)!!

                    val index = header.find(job.columnName)
                    // source.indexOf("fetch_") because in fetcher path named with fetch_ prefix
                    val key = source.substring(source.indexOf("fetch_") + 6, source.length - 4)
                    body.add(Row())
                    body[i].addField(key)
                    body[i].addField(job.functionName)
                    rows.forEach { row ->
                        body[i].addField(row.fields[index])
                    }
                }
                val path = "${(_in["directory"] as File).path}${File.separator}mapper_$job.csv"
                Handler.writeToFile(path, head, body)
                files.add(path)
            }
        }
        _in["mapper_files"] = files
        return _in
    }
}