package com.sqlcompiler.kotlin

object Utils {
    fun smartSplit(column: String, result: String): String {
        val builder = StringBuilder(" && (")
        val split = result.split(",")
        split.forEachIndexed { index, r ->
            builder.append("$column == $r")
            if (index != split.size - 1) {
                builder.append(" || ")
            }
        }
        builder.append(") ")
        return builder.toString()
    }
}