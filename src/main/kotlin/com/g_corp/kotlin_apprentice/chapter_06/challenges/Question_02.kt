package com.g_corp.kotlin_apprentice.chapter_06.challenges

fun main(args: Array<String>) {
    println("fibonacci(10) = ${fibonacci(10)}")
}

fun fibonacci(number: Int): Int {
    return when (number) {
        in Int.MIN_VALUE..0 -> 0
        in 1..2 -> 1
        else -> {
            var a = 1
            var b = 1
            var c = a + b
            for (i in 3..number) {
                c = a + b
                a = b
                b = c
            }
            c
        }
    }
}
