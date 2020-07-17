package com.g_corp.kotlin_apprentice.chapter_13.mini_exercises

fun main(args: Array<String>) {
    val tv = TV(105.9, 188.2)
    val size = tv.diagonal
    println("size = $size")
}

class TV(var height: Double, var width: Double) {
    val diagonal: Int
        get() {
            val result = Math.sqrt(height * height + width * width)
            return Math.round(result).toInt()
        }
}
