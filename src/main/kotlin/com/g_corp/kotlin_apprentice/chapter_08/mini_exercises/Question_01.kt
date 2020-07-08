package com.g_corp.kotlin_apprentice.chapter_08.mini_exercises

fun main(args: Array<String>) {
    val player = "Dan"
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println("$player is at index ${players.indexOf(player)}")
}
