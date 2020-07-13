package com.g_corp.kotlin_apprentice.chapter_10.challenges

import com.g_corp.kotlin_apprentice.chapter_06.challenges.fibonacci

fun main(args: Array<String>) {
    println("Question")
    var result = mathSum(3, { fibonacci(it) })
    println("result = $result")
}

fun mathSum(length: Int, series: (Int) -> Int): Int {
    var sum = 0

    for (i in 1..length)
        sum += series(i)
    return sum
}
