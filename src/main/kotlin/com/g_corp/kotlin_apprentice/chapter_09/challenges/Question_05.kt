package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun valuesAreUnique(map: Map<String, Int>): Boolean {
    val mapCount = mutableMapOf<Int, Int>()
    var count: Int

    for (value in map.values) {
        count = mapCount.getOrDefault(value, 0) + 1
        mapCount[value] = count

        if (count >= 2)
            return false
    }
    return true
}
