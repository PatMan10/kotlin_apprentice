package com.g_corp.kotlin_apprentice.chapter_05.challenges

fun main(args: Array<String>) {
    var sum = 0
    var interations = 0
    for (i in 0..5) {
        sum += i
        interations++
    }
    println("sum = $sum")
    println("interations = $interations")
}
