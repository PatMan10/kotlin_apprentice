package com.g_corp.kotlin_apprentice.chapter_04.challenges

fun main(args: Array<String>) {
    val limit = 6
    var number = limit
    var total = 0
    var multiplier = number - 1
    while (multiplier > 0) {
        total = number * multiplier
        number = total
        multiplier--
    }
    println("$limit! = $total")
}
