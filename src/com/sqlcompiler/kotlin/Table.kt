package com.sqlcompiler.kotlin

data class Table(val name: String = "<table_name>",
                 val columns: ArrayList<Column>,
                 val locations: ArrayList<String>,
                 val delimiter: String) {

    init {
        columns.forEach { col -> col.table = this }
    }
    override fun toString(): String {
        return "{ name: $name, columns: $columns, locations: $locations }"
    }
}