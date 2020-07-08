package com.g_corp.kotlin_apprentice.chapter_08.challenges

fun main(args: Array<String>) {
    println("Chalenge Question")
}

fun minMax(numbers: Array<Int>): Pair<Int, Int> {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    for (number in numbers) {
        if (number > max)
            max = number
        if (number < min)
            min = number
    }

    return Pair(min, max)
}
