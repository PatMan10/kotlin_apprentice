package com.g_corp.kotlin_apprentice.chapter_05.mini_exercises.labeled_statements

fun main(args: Array<String>) {
    var sum = 0
    for (row in 1 until 8 step 2)
        for (col in 0 until 8)
            sum += row * col
    println("sum = $sum")
}
