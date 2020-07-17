package com.g_corp.kotlin_apprentice.chapter_13.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

class IceCream(val name: String = "Chocolate") {
    val ingredients: ArrayList<String> by lazy {
        ArrayList<String>()
    }
}
