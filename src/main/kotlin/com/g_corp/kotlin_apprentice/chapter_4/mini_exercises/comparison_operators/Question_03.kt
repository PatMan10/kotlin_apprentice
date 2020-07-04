package com.g_corp.kotlin_apprentice.chapter_4.mini_exercises.comparison_operators

fun main(args: Array<String>) {
    val reader = "Patrick Heynes"
    val author = "Eliot Alderson"
    val authorIsReader = author.equals(reader)
    println("reader = $reader")
    println("author = $author")
    println("authorIsReader = $authorIsReader")
}
