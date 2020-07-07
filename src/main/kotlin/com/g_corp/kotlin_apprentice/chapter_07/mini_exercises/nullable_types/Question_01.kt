package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.nullable_types

fun main(args: Array<String>) {
    for (i in 0..10)
        println("song $i:  ${getSong(i)}")
}

fun getSong(number: Int): String? {
    return when (number) {
        1 -> "Lenny Kravitz - Fly Away"
        2 -> "Lenny Kravitz - Are You Gonna Go My Way"
        4 -> "Lil Wayne - Trigger Finger"
        7 -> "Lil Wayne - Gun Walk"
        8 -> "Lil Wayne - Mrs. Officer"
        10 -> "Santana - Black Magic Woman"
        else -> null
    }
}
