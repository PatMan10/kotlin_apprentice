package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    val answer1 = true && true // true
    val answer2 = false || false // false
    val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1) // true
    val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0) // true

    println("true && true = $answer1")
    println("false || false = $answer2")
    println("(true && 1 != 2) || (4 > 3 && 100 < 1) = $answer3")
    println("((10 / 2) > 3) && ((10 % 2) == 0) = $answer4")
}
