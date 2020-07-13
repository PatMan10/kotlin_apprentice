package com.g_corp.kotlin_apprentice.chapter_10.challenges

fun main(args: Array<String>) {
    repeatTask(10, { println("Kotlin Apprentice is a great book!") })
}

fun repeatTask(times: Int, task: () -> Unit) {
    for (i in 1..times)
        task()
}
