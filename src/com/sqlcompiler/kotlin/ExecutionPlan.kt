package com.sqlcompiler.kotlin

import java.io.File
import java.io.FileWriter

object ExecutionPlan {
    private val steps: ArrayList<String> = ArrayList()
    private val descriptions: ArrayList<String> = ArrayList()

    fun addStep(step: String, description: String) {
        this.steps.add(step)
        this.descriptions.add(description)
    }

    fun draw(fileName: String) {
        val file = File("${fileName}_execution_plan.txt")
        file.createNewFile()
        val writer = FileWriter(file)
        this.steps.forEachIndexed { index, step ->
            writer.write(step)
            writer.write(descriptions[index])
            if (index < this.steps.count() - 1) {
                writer.write("\n⇓\n")
            }
        }
        writer.close()
    }
}