package com.g_corp.kotlin_apprentice

fun main(args: Array<String>) {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val multiply: (Int, Int) -> Int = fun(a, b) = a * b
    println("1 + 5 = ${operateOnNumbers(1, 5, add)}")
    println("2 x 5 = ${operateOnNumbers(2, 5, multiply)}")
    val div: (Double, Double) -> Double = ::divide
    println("6 / 2 = ${operateOnNumbers(6.0, 2.0, div)}")
}

fun divide(number: Double, divisor: Double): Double = number / divisor

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(a, b)
    println("result = $result")
    return result
}

fun operateOnNumbers(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    val result = operation(a, b)
    println("result = $result")
    return result
}
