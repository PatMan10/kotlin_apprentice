package com.g_corp.kotlin_apprentice.chapter_03.mini_exercises.pairs_and_triples

fun main(args: Array<String>) {
    val date: Triple<Int, Int, Int> = Triple(30, 9, 1995)
    var (day, month, year) = date
    month = 12
    val dayAndMonth: Pair<Int, Int> = Pair(month, year)
    println("month = $month")
    println("year = $year")
}
