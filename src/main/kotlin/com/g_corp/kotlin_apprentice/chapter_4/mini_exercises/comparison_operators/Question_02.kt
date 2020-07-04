package com.g_corp.kotlin_apprentice.chapter_4.mini_exercises.comparison_operators

fun main(args: Array<String>) {
    val myAge = 24
    val theirAge = 30
    val bothTeenagers =
        (13 >= myAge && myAge <= 19) &&
            (13 >= theirAge && theirAge <= 19)
    println("myAge = $myAge")
    println("theirAge = $theirAge")
    println("bothTeenagers = $bothTeenagers")
}
