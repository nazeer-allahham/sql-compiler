package com.sqlcompiler.kotlin

class DesiredColumn(val columnName: String, val functionName: String = "", val columnAlias: String = "") {
    val title = fun(): String {
        return when {
            columnAlias !== "" -> columnAlias
            functionName !== "" -> "$functionName ($columnName)"
            else -> columnName
        }
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
}