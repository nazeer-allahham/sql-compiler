package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment

data class Table(val name: String = "<table_name>",
                 val columns: ArrayList<Table.Column> = ArrayList(),
                 val location: String = Environment.TABLES_PATH + "<table_name>") {

    override fun toString(): String {
        return "{ name: $name, columns: $columns, url: $location }"
    }

    class Column(val name: String,
                 val type: String) {
        override fun toString(): String {
            return "{ name => $name, type => $type }"
        }
    }
}