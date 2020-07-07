package com.g_corp.kotlin_apprentice.chapter_06.mini_excercises

fun main(args: Array<String>) {
    printFullName("Patrick", "Heynes")
    printFullName("Eliot", "Alderson")
}

fun printFullName(firstName: String = "Bob", lastName: String = "Brown") {
    println("$firstName $lastName")
}
