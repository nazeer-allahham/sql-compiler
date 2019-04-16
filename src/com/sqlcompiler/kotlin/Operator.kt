package com.sqlcompiler.kotlin

import kotlin.random.Random

class Operator(private val code: Int, private val comparator: () -> Unit) {
    companion object {
        const val EQUAL = 1
        const val NOT_EQUAL = 2
        const val GREATER_THAN_OR_EQUAL = 3
        const val LESS_THAN_OR_EQUAL = 4

        fun newInstance(code: Int): Operator {
            return when (code) {
                EQUAL -> Operator(EQUAL, fun() { println("Hello EQUAL") })
                NOT_EQUAL -> Operator(NOT_EQUAL, fun() { println("Hello NOT_EQUAL") })
                GREATER_THAN_OR_EQUAL -> Operator(GREATER_THAN_OR_EQUAL, fun() { println("Hello GREATER_THAN_OR_EQUAL") })
                LESS_THAN_OR_EQUAL -> Operator(LESS_THAN_OR_EQUAL, fun() { println("Hello LESS_THAN_OR_EQUAL") })
                else -> Operator(code, fun() { println("Hello other") })
            }
        }
    }

    fun compare(left: String, right: String): Boolean {
        // TODO return this.comparator()
        return Random(1).nextBoolean()
    }
}