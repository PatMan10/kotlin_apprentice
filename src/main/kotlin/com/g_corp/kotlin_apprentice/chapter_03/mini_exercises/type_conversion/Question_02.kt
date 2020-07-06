package com.g_corp.kotlin_apprentice.chapter_03.mini_exercises.type_conversion

fun main(args: Array<String>) {
    val age1 = 20
    val age2 = 25
    val averageAge = (age1 + age2) / 2
    println("($age1 + $age2) / 2 = $averageAge")
    println("averageAge is Double = ${averageAge !is Int}")
}
