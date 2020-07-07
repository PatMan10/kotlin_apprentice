package com.g_corp.kotlin_apprentice.chapter_07.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun getMessage_03(divisionCount: Int?) = "It divides $divisionCount times."

fun divideIfWhole_03(value: Int, divisor: Int): Int {
    if (divisor.equals(0)) return 0

    var divisionResult: Double = value / divisor.toDouble()

    if (divisionResult % 1 != 0.0)
        return 0

    var counter = 0
    while (divisionResult % 1 == 0.0) {
        ++counter
        divisionResult = divisionResult / divisor
    }
    return counter
}
