package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

fun main(args: Array<String>) {
    val nameList = listOf("Patrick", "Dora", "Ethan", "Anga", "Sethu")
    println(concatenateLongerThan(6, nameList))
}

fun concatenateLongerThan(length: Int, list: List<String>): String =
    list
        .filter({ it -> it.length > length })
        .fold("", { a, b -> a + b })
