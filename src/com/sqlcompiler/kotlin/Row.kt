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

    override fun equals(other: Any?): Boolean {
        if (other !is Row)
            return false
        this.fields.forEachIndexed { i, field -> if (other.fields[i] != field) return false }
        return true
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

    fun filterStrings(columns: ArrayList<String>): ArrayList<Int> {
        val indexes = ArrayList<Int>()
        columns.forEach { i -> indexes.add(find(i)) }
        return indexes
    }

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

    fun concatenate(row: Row): Row {
        val res = Row()
        this.fields.forEach { field -> res.addField(field) }
        row.fields.forEach { field -> res.addField(field) }
        return res
    }

    fun concatenate(count: Int, fill: String): Row {
        val res = Row()
        this.fields.forEach { field -> res.addField(field) }
        for (i in 0 until count) {
            res.addField(fill)
        }
        return res
    }

    fun concatenate(count: Int, fill: String, offset: Int): Row {
        val res = Row()
        var i1: Int
        var i = 0

        while (i < offset && i < this.fields.size) {
            res.addField(this.fields[i++])
        }
        i1 = i
        while (i < i1 + count) {
            res.addField(fill)
            i++
        }
        while (i1 < this.fields.size) {
            res.addField(this.fields[i1++])
        }
        return res
    }

    fun contains(row: Row, ids: ArrayList<Int>): Boolean {
        for (i in ids) {
            if (i >= 0 && row.fields[i] != this.fields[i])
                return false
        }
        return true
    }
}