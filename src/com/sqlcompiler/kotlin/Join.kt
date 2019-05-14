package com.sqlcompiler.kotlin

class Join(val joinType: String, val tableName: String, val tableAlias: String = "", val condition: String, val conditionColumns: ArrayList<String>) {

    override fun toString(): String {
        return "{ join_type => $joinType, table_name => $tableName, tableAlias => $tableAlias, condition => $condition, columns => $conditionColumns }"
    }
}