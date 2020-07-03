package com.g_corp.kotlin_apprentice.chapter_3.challenges

fun main(args: Array<String>) {
    val triple = Triple(100, 1.5, 10)
    val value = triple.second
    println("value is type Double = ${value is Double}")
}
