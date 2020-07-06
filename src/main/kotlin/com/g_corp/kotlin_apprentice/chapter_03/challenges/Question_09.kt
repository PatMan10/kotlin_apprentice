package com.g_corp.kotlin_apprentice.chapter_03.challenges

fun main(args: Array<String>) {
    val a = 3
    val b: Short = 100
    val c: Byte = 12
    val result = a + b - c
    println("$a + $b - $c = $result")
    println("result is type Int = ${result is Int}")
}
