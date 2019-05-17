package com.sqlcompiler.kotlin

import kotlin.math.roundToInt

data class Row(val fields: ArrayList<String> = ArrayList()) {
    fun addField(field: String) {
        this.fields.add(field)
    }

    fun addField(position: Int, field: String) {
        this.fields.add(position, field)
    }

    fun addFields(fields: ArrayList<String>) {
        for (field in fields) {
            this.fields.add(field)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Row)
            return false
        this.fields.forEachIndexed { i, field -> if (other.fields[i] != field) return false }
        return true
    }

    override fun toString(): String {
        val s = StringBuilder()
        this.fields.forEachIndexed { index, field -> s.append(field).append(if (index == this.fields.size - 1) "\n" else ",") }
        return s.toString()
    }

    fun find(param: String): Int {
        this.fields.forEachIndexed { i, field -> if (field == param) return i }
        return -1
    }

    fun map(columns: ArrayList<Int>): Row {
        val row = Row()
        columns.forEach { i -> row.addField(this.fields[i]) }
        return row
    }

    fun filterStrings(columns: ArrayList<String>): ArrayList<Int> {
        val indexes = ArrayList<Int>()
        columns.forEach { i -> indexes.add(find(i)) }
        return indexes
    }

    fun filter(columns: ArrayList<DesiredColumn>): ArrayList<Int> {
        val indexes = ArrayList<Int>()
        columns.forEach { i -> indexes.add(find(i.columnName)) }
        return indexes
    }

    fun get(key: String): String {
        return this.fields[this.find(key)]
    }

    fun get(index: Int): String {
        if (index < 0 || index >= this.fields.size)
            return ""
        return this.fields[index]
    }

    fun splice(from: Int, end: Int): ArrayList<String> {
        val res = ArrayList<String>()
        println("$from + $end + ${this.fields}")
        for (i in from..end) {
            res.add(this.fields[i])
        }
        return res
    }

    fun concatenate(row: Row): Row {
        val res = Row()
        this.fields.forEach { field -> res.addField(field) }
        row.fields.forEach { field -> res.addField(field) }
        return res
    }

    fun concatenate(count: Int, fill: String): Row {
        val res = Row()
        this.fields.forEach { field -> res.addField(field) }
        for (i in 0 until count) {
            res.addField(fill)
        }
        return res
    }

    fun concatenate(count: Int, fill: String, offset: Int): Row {
        val res = Row()
        var i1: Int
        var i = 0

        while (i < offset && i < this.fields.size) {
            res.addField(this.fields[i++])
        }
        i1 = i
        while (i < i1 + count) {
            res.addField(fill)
            i++
        }
        while (i1 < this.fields.size) {
            res.addField(this.fields[i1++])
        }
        return res
    }

    fun contains(row: Row, ids: ArrayList<Int>): Boolean {
        for (i in ids) {
            if (i >= 0 && row.fields[i] != this.fields[i])
                return false
        }
        return true
    }

    fun sort(functionName: String, start: Int) {
        when (functionName) {
            "min" -> {
                fields.add(start, min(start))
            }
            "max" -> {
                fields.add(start, max(start))
            }
            "count" -> {
                this.fields.add(start, count(start))
            }
            "sum" -> {
                this.fields.add(start, sum(start).roundToInt().toString())
            }
            "avg" -> {
                this.fields.add(start, avg(start).toString())
            }
            "std" -> {
                this.fields.add(start, std(start).toString())
            }
            "Q2" -> {
                this.fields.add(start, q2(start).toString())
            }
            "Q3" -> {
                this.fields.add(start, q3(start).toString())
            }
            "mode" -> {
                this.fields.add(start, mode(start))
            }
            "mean" -> {
                this.fields.add(start, mean(start).toString())
            }
            "median" -> {
                this.fields.add(start, median(start).toString())
            }
        }
    }

    fun max(start: Int): String {
        var max = fields[start]
        for (i in start + 1 until fields.size)
            if (fields[i] > max) {
                max = fields[i]
            }
        return max
    }

    fun min(start: Int): String {
        var min = fields[start]
        for (i in start + 1 until fields.size)
            if (fields[i] < min) {
                min = fields[i]
            }
        return min
    }

    fun count(start: Int): String {
        return "${this.fields.size - start}"
    }

    fun sum(start: Int): Double {
        var sum = 0.0
        for (i in start until this.fields.size)
            sum += fields[i].toDouble()
        return sum
    }

    fun avg(start: Int): Double {
        return sum(start) * 1.0 / (this.fields.size - start)
    }

    fun std(start: Int): Double {
        var std = 0.0
        val mean = mean(start)

        for (i in start until fields.size) {
            std += Math.pow(fields[i].toDouble() - mean, 2.0)
        }
        return Math.sqrt(std / (fields.size - start))
    }

    fun q2(start: Int): Double {
        return -1.0
    }

    fun q3(start: Int): Double {
        return -1.0
    }

    fun mode(start: Int): String {
        var maxValue = ""
        var maxCount = 0

        for (i in start until fields.size) {
            var count = 0
            for (j in i + 1 until fields.size)
                if (fields[i] == fields[j]) count++
            if (count > maxCount) {
                maxValue = fields[i]
                maxCount = count
            }
        }
        return maxValue
    }

    fun mean(start: Int): Double {
        return sum(start) * 1.0 / (this.fields.size - start)
    }

    fun median(start: Int): Double {
        val length = fields.size - start
        val middle = length / 2
        return if (length % 2 == 1)
            fields[middle].toDouble()
        else
            (fields[middle - 1].toDouble() + fields[middle].toDouble()) / 2.0
    }

    fun swap(i: Int, j: Int) {
        val temp = this.fields[i]
        this.fields[i] = this.fields[j]
        this.fields[j] = temp
    }

    override fun hashCode(): Int {
        return fields.hashCode()
    }
}