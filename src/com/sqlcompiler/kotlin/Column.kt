package com.sqlcompiler.kotlin

class Column {
    var table: Table? = null
    var title: String
    var type: String


    constructor(title: String, type: String) {
        this.title = title
        this.type = type

    }

    constructor(table: Table, title: String, type: String) {
        this.table = table
        this.title = title
        this.type = type
    }

    override fun toString(): String {
        return "{table_name: ${this.table?.name}, title: $title, type: $type}"
    }
}