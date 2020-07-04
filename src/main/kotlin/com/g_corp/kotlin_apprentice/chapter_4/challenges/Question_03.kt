package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    val pairCurrentPosition = Pair(0, 0)
    val intCurrentPosition = pairCurrentPosition.first * 8 + pairCurrentPosition.second % 8

    val intNextPosition = if (intCurrentPosition < 63) intCurrentPosition + 1 else 0
    val pairNextPosition = Pair(intNextPosition / 8, intNextPosition % 8)

    val (row, col) = pairNextPosition
    println("row = $row col = $col")
}
