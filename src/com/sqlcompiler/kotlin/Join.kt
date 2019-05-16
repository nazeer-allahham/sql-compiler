package com.sqlcompiler.kotlin

class Join(var type: String,
           var tableName: String,
           private var tableAlias: String = "",
           var condition: String,
           var conditionColumns: ArrayList<String>,
           var stringsColumns: ArrayList<String> = ArrayList()) {

    override fun toString(): String {
        return "{ join_type => $type, table_name => $tableName, tableAlias => $tableAlias, condition => $condition, columns => $conditionColumns }"
    }
}