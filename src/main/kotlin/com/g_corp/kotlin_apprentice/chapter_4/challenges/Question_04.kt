package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    val a = 1
    val b = 3
    val c = 4
    val x1 = (-b + Math.sqrt(Math.pow(b.toDouble(), 2.0) - (4 * a * c)) / (2 * a))
    val x2 = (-b - Math.sqrt(Math.pow(b.toDouble(), 2.0) - 4 * a * c)) / 2 * a
    println("x1 = $x1 x2 = $x2")
}
