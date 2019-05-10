package com.sqlcompiler.kotlin

data class Row(val fields: ArrayList<String> = ArrayList()) {
    fun addField(field: String) {
        this.fields.add(field)
    }

    fun addFields(fields: ArrayList<String>) {
        for (field in fields) {
            this.fields.add(field)
        }
    }

    override fun toString(): String {
        val s = StringBuilder()
        this.fields.forEachIndexed { index, field -> s.append(field).append(if (index == this.fields.size - 1) "\n" else ",") }
        return s.toString()
    }

    fun find(param: String): Int {
        this.fields.forEachIndexed { i, field -> if (field == param) return i }
        return -1
    }

    fun map(columns: ArrayList<Int>): Row {
        val row = Row()
        columns.forEach { i -> row.addField(this.fields[i]) }
        return row
    }

    /*
    fun filter(columns: ArrayList<String>): ArrayList<Int> {
        val indexes = ArrayList<Int>()
        columns.forEach { i -> indexes.add(find(i)) }
        return indexes
    }
    */
    fun filter(columns: ArrayList<DesiredColumn>): ArrayList<Int> {
        val indexes = ArrayList<Int>()
        columns.forEach { i -> indexes.add(find(i.columnName)) }
        return indexes
    }

    fun get(key: String): String {
        return this.fields[this.find(key)]
    }

    fun splice(from: Int, end: Int): ArrayList<String> {
        val res = ArrayList<String>()
        println("$from + $end + ${this.fields}")
        for (i in from..end) {
            res.add(this.fields[i])
        }
        return res
    }
}