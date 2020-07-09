package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

fun main(args: Array<String>) {
    println("Mini Exercise")
}

fun filterGreaterThan(number: Int, map: Map<String, Int>): Map<String, Int> =
    map.filter({ it -> it.value > number })

fun getKeys(map: Map<String, Int>): Set<String> =
    map.map({ it -> it.key }).toSet()
