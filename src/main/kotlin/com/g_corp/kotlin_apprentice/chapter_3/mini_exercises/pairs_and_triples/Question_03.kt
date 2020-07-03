package com.g_corp.kotlin_apprentice.chapter_3.mini_exercises.pairs_and_triples

fun main(args: Array<String>) {
    val date: Triple<Int, Int, Int> = Triple(30, 9, 1995)
    val (_, month, year) = date
    println("month = $month")
    println("year = $year")
}
