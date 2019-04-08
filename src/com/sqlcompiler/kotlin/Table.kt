package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment

data class Table(val name: String = "<table_name>",
                 val columns: ArrayList<Column>,
                 val location: String = Environment.TABLES_PATH + "<table_name>") {

    init {
        columns.forEach { col -> col.table = this }
    }
    override fun toString(): String {
        return "{ name: $name, columns: $columns, url: $location }"
    }
}