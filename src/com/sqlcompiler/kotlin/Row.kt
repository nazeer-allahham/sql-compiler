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
        this.fields.forEach { f -> s.append(f).append("\t") }
        return s.toString()
    }

    fun find(param: String): Int {
        this.fields.forEachIndexed { i, field -> if (field == param) return i }
        return -1
    }
}