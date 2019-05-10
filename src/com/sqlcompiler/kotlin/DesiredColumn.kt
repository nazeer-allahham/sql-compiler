package com.sqlcompiler.kotlin

class DesiredColumn(val columnName: String, val functionName: String = "") {
    fun get(): Unit {

    }

    fun hasGroupingFunction(): Boolean {
        return this.functionName.isNotEmpty()
    }

    fun isDefault(): Boolean {
        return this.columnName == "_" && this.functionName == "_"
    }

    override fun toString(): String {
        return "${columnName}_$functionName"
    }

    fun fullName(): String {
        if (this.functionName == "") {
            return this.columnName
        } else {
            return "$functionName($columnName)"
        }
    }
}