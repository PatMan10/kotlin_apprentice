package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun filterValuesLongerThan(length: Int, map: Map<String, String>): Map<String, String> {
    val mapToReturn = mutableMapOf<String, String>()
    var currentValue: String?

    for (key in map.keys) {
        currentValue = map[key]
        if (currentValue != null && currentValue.length > length)
            mapToReturn[key] = currentValue
    }

    return mapToReturn
}
