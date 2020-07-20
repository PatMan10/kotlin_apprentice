package com.g_corp.kotlin_apprentice.chapter_15.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

sealed class Resource {
    class Loading()
    class Success(var message: String)
    class Error(var message: String)
}
