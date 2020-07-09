package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val mapCharCount = mutableMapOf<Char, Int>()

    for (c in text)
        mapCharCount[c] = mapCharCount.getOrDefault(c, 0) + 1

    return mapCharCount
}
