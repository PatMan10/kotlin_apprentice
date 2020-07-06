package com.g_corp.kotlin_apprentice.chapter_04.challenges

fun main(args: Array<String>) {
    val a = 2
    val b = -4
    val c = -3
    val bSquare = Math.pow(b.toDouble(), 2.0)
    val _4ac = (4 * a * c)
    val _2a = 2 * a
    val x1 = (-b - Math.sqrt(bSquare - _4ac)) / _2a
    val x2 = (-b + Math.sqrt(bSquare - _4ac)) / _2a
    val x1Rounded = Math.round(x1 * 100) / 100.0
    val x2Rounded = Math.round(x2 * 100) / 100.0
    println("bSquare = $bSquare")
    println("_4ac = $_4ac")
    println("_2a = $_2a")
    println("x1 = $x1Rounded")
    println("x2 = $x2Rounded")
}
