package com.g_corp.kotlin_apprentice.chapter_4.challenges

import kotlin.math.log2

fun main(args: Array<String>) {
    val number = 16.1
    val isPowerOf2 = log2(number) % 1.0 == 0.0
    val not = if (!isPowerOf2) " not" else ""
    println("$number is$not a power of 2")
}
