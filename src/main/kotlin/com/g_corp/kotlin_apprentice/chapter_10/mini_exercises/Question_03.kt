package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

fun main(args: Array<String>) {
    println("Mini Exercise")
}

fun filterLessThan(number: Int, map: Map<String, Int>): Map<String, Int> =
    map.filter({ it -> it.value < number })
