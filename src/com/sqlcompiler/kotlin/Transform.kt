package com.sqlcompiler.kotlin

class Transform(val name: String,
                val params: ArrayList<String>) {
    fun parseParams(): ArrayList<String> {
        val result = ArrayList<String>()

        params.forEach { param ->
            if (param.startsWith("['\"]"))
                result.add(param.substring(1, param.length - 1))
            else
                result.add(param)
        }
        return result
    }
}