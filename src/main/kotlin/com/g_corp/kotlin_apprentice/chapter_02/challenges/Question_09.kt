package com.g_corp.kotlin_apprentice.chapter_02.challenges

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val x1: Double = 4.0
    val y1: Double = 3.0
    val x2: Double = 3.0
    val y2: Double = -2.0

    val distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    println("dinstance between A($x1, $y1) B($x2, $y2) = $distance")
}
