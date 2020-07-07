package com.g_corp.kotlin_apprentice.chapter_05.mini_exercises.when_expression

fun main(args: Array<String>) {
    val age = 10
    val lifeStage = when (age) {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..39 -> "Young Adult"
        in 40..59 -> "Adult"
        in 60..99 -> "Elderly"
        else -> "Invalid Age"
    }
    println("age $age is stage: $lifeStage")
}
