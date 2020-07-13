package com.g_corp.kotlin_apprentice

fun main(args: Array<String>) {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce({ a, b -> a + b })
    println("sum = $sum")
}
