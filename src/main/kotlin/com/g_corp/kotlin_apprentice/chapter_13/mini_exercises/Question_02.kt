package com.g_corp.kotlin_apprentice.chapter_13.mini_exercises

fun main(args: Array<String>) {
}

class Circle(var radius: Double = 0.0) {
    val circumfrence: Double
        get() = Math.PI * radius * 2

    val area: Double by lazy {
        val area = (radius * radius) * Math.PI
        Math.round(area * 100) / 100.0
    }
}
