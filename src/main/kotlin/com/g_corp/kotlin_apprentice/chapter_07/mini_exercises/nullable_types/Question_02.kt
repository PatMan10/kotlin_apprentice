package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.nullable_types

fun main(args: Array<String>) {
    val intOrNull_1 = "10"
    val intOrNull_2 = "1"
    val intOrNull_3 = "1aaaa"
    val intOrNull_4 = "null"

    println("parseInt($intOrNull_1) = ${parseInt(intOrNull_1)}")
    println("parseInt($intOrNull_2) = ${parseInt(intOrNull_2)}")
    println("parseInt($intOrNull_3) = ${parseInt(intOrNull_3)}")
    println("parseInt($intOrNull_4) = ${parseInt(intOrNull_4)}")
}

fun parseInt(number: String): Int? = number.toIntOrNull()
