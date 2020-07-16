package com.g_corp.kotlin_apprentice.chapter_12.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

interface ThresholdChecker {
    val lowerLimit: Int
    val upperLimit: Int

    fun isAbove(value: Int): Boolean
    fun isBelow(value: Int): Boolean
    fun isIn(value: Int): Boolean
}
