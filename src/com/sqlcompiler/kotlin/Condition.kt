package com.sqlcompiler.kotlin

class Condition(private val left: String,
                private val right: String,
                private val operator: Operator) {
    fun calc(): Boolean {
        return this.operator.compare(left, right)
    }
}
