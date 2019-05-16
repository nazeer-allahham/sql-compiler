package com.sqlcompiler.kotlin

class Join(var type: String,
           var tableName: String,
           private var tableAlias: String = "",
           var condition: String,
           var definitions: ArrayList<Condition>) {

    override fun toString(): String {
        return "{ type => $type, table_name => $tableName, table_alias => $tableAlias, condition => $condition, definitions => $definitions }"
    }
}