package com.g_corp.kotlin_apprentice.chapter_07.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun getMessage_02(divisionCount: Int?) =
    if (divisionCount != null)
        "Yep, it divides $divisionCount times."
    else "Not divisible. :["

fun divideIfWhole_02(value: Int, divisor: Int): Int? {
    if (divisor.equals(0)) return null

    var divisionResult: Double = value / divisor.toDouble()

    if (divisionResult % 1 != 0.0)
        return null

    var counter = 0
    while (divisionResult % 1 == 0.0) {
        ++counter
        divisionResult = divisionResult / divisor
    }
    return counter
}
