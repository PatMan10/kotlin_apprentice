package com.g_corp.kotlin_apprentice.chapter_04.mini_exercises.if_expresion

fun main(args: Array<String>) {
    val myAge = 24
    val isTeenager = 13 >= myAge && myAge <= 19
    val answer = if (isTeenager) "Teenager" else "Not a teenager"
    println("myAge = $myAge")
    println(answer)
}
