package com.g_corp.kotlin_apprentice.chapter_09.mini_exercises

fun main(args: Array<String>) {
    var namesAndScores: MutableMap<String, Int> =
        mutableMapOf(
            "Anna" to 2,
            "Brain" to 2,
            "Craig" to 8,
            "Donna" to 6
        )
    namesAndScores.put("Patrick", Int.MAX_VALUE)
    namesAndScores.set("Anna", 100)
    namesAndScores.set("Donna", Int.MIN_VALUE)
    namesAndScores["Zoro"] = 101

    println(namesAndScores)
    for (key in namesAndScores.keys)
        printScore(key, namesAndScores)
}

fun printScore(name: String, players: MutableMap<String, Int>) {
    val score = players[name]
    if (score != null)
        println("$name has scored $score")
    else
        println("$name is not in the game")
}
