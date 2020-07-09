package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun mergeMaps(maps: List<Map<String, String>>): Map<String, String> {
    val mergedMap = mutableMapOf<String, String>()

    for (map in maps)
        mergedMap.putAll(map)

    return mergedMap
}
