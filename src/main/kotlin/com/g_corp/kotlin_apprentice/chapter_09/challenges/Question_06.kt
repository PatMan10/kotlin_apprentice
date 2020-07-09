package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    val nameTitleLookup: MutableMap<String, String?> =
        mutableMapOf(
            "Patrick" to "Engineer",
            "Mary" to "Intern",
            "Ray" to "Hacker"
        )
    nameTitleLookup["Mary"] = null
    nameTitleLookup.remove("Ray")
    println(nameTitleLookup)
}
