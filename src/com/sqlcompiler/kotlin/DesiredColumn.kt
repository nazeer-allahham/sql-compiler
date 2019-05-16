package com.sqlcompiler.kotlin

class DesiredColumn(var columnName: String = "",
                    var tableName: String = "",
                    var columnAlias: String = "",
                    var functionName: String = "",
                    var distinct: Boolean = false,
                    var transforms: ArrayList<Transform> = ArrayList()) {

    val title = fun(): String {
        return when {
            columnAlias !== "" -> columnAlias
            functionName !== "" -> "$functionName ($columnName)"
            //else -> "${tableName}_$columnName"
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

    fun hasRowFunctions(): Boolean {
        return this.transforms.isNotEmpty()
    }

    fun addTransform(transform: Transform) {
        this.transforms.add(transform)
    }

    override fun toString(): String {
        return "${columnName}_$functionName"
    }
}