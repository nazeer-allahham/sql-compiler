package com.sqlcompiler.kotlin

class Column(var name: String, var type: String, var table: Table? = null) {

    override fun toString(): String {
        return "{table_name: ${this.table?.name}, name: $name, type: $type}"
    }
}