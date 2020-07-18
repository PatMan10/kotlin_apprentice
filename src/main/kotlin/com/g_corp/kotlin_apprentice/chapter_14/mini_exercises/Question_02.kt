package com.g_corp.kotlin_apprentice.chapter_14.mini_exercises

fun main(args: Array<String>) {
    println("Mini Exercise")
    SimpleDate(Days.Monday, Months.January, 2020)
}

class MyMath {
    companion object {
        fun factorial(n: Int): Int =
            (1..n).fold(1, { a, b -> a * b })

        fun traingle(n: Int): Int =
            (1..n).fold(0, { a, b -> a + b })
    }
}
