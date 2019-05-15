package com.sqlcompiler.kotlin

class DesiredColumn(val columnName: String,
                    val functionName: String = "",
                    private val columnAlias: String = "",
                    private val distinct: Boolean = false) {

    val title = fun(): String {
        return when {
            columnAlias !== "" -> columnAlias
            functionName !== "" -> "$functionName ($columnName)"
            else -> columnName
        }
    }

    fun hasGroupingFunction(): Boolean {
        println(this.columnName + " " + this.functionName.isNotEmpty())
        return this.functionName.isNotEmpty()
    }

    fun isDefault(): Boolean {
        return this.columnName == "_" && this.functionName == "_"
    }

    fun isDistinct(): Boolean {
        return this.distinct
    }

    override fun toString(): String {
        return "${columnName}_$functionName"
    }
}