package com.g_corp.kotlin_apprentice.chapter_03.mini_exercises.pairs_and_triples

fun main(args: Array<String>) {
    val date: Triple<Int, Int, Int> = Triple(30, 9, 1995)
    val (day, month, year) = date
    println("day = $day")
    println("month = $month")
    println("year = $year")
}
