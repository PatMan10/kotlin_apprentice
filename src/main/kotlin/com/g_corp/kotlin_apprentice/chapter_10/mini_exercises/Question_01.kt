package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

fun main(args: Array<String>) {
    val nameList = listOf("Patrick", "Dora", "Ethan", "Anga", "Sethu")
    println(concatenate(nameList))
}

fun concatenate(list: List<String>): String =
    list.fold("", { a, b -> a + b })
