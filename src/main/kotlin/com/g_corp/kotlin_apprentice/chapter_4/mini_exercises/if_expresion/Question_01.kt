package com.g_corp.kotlin_apprentice.chapter_4.mini_exercises.if_expresion

fun main(args: Array<String>) {
    val myAge = 24
    val isTeenager = 13 >= myAge && myAge <= 19

    println("myAge = $myAge")
    if (isTeenager)
        println("Teenager")
    else
        println("Not a teenager")
}
