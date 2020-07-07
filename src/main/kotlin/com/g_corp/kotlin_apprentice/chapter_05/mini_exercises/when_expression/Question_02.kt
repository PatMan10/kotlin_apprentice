package com.g_corp.kotlin_apprentice.chapter_05.mini_exercises.when_expression

fun main(args: Array<String>) {
    val person = Pair("Patrick", 24)
    val (name, age) = person
    when (age) {
        in 0..2 -> println("$name is a infant.")
        in 3..12 -> println("$name is a child.")
        in 13..19 -> println("$name is a teenager.")
        in 20..39 -> println("$name is a young adult.")
        in 40..59 -> println("$name is a adult.")
        in 60..99 -> println("$name is a elderly.")
        else -> println("Invalid age.")
    }
}
