package com.sqlcompiler.kotlin

class Column(private val tableName: String, private val title: String) {
    override fun toString(): String {
        return "{table_name: $tableName, title: $title}"
    }
}