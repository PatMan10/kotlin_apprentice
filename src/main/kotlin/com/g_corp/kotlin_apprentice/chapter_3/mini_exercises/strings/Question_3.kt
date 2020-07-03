package com.g_corp.kotlin_apprentice.chapter_3.mini_exercises.strings

fun main(args: Array<String>) {
    val firstName = "Patrick"
    val lastName = "Heynes"
    val fullName = firstName + " " + lastName
    val intro = "Hello, my name is $fullName"
    println("firstName = $firstName")
    println("lastName = $lastName")
    println("fullName = $fullName")
    println(intro)
}
