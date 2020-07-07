package com.g_corp.kotlin_apprentice.chapter_06.challenges

fun main(args: Array<String>) {
}

fun isDivisible(number: Int, divisor: Int): Boolean {
    if (divisor.equals(0))
        return false

    return number % divisor == 0
}

fun isPrime(number: Int): Boolean {
    if (number <= 0)
        return false

    val sqrRoot = Math.sqrt(number.toDouble())
    val loopNumber = if (sqrRoot != 2.0 && sqrRoot % 1 == 0.0) sqrRoot.toInt() else number
    var factorCounter = 1

    for (i in 2..loopNumber) {
        if (isDivisible(loopNumber, i))
            factorCounter++
        if (factorCounter >= 3)
            return false
    }

    return true
}
