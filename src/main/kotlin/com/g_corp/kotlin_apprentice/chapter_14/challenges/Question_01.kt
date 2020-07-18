package com.g_corp.kotlin_apprentice.chapter_14.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

class Circle(var radius: Double = 0.0) {
    val area: Double
        get() {
            val area = (radius * radius) * Math.PI
            return Math.round(area * 100) / 100.0
        }

    fun grow(factor: Int) {
        this.radius *= factor
    }
}
