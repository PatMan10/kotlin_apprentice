package com.g_corp.kotlin_apprentice

fun main(args: Array<String>) {
    println("App Running")

    var yearOfBirth: Map<String, Int> = mapOf("Patrick" to 1995, "Faith" to 2006)
    println(yearOfBirth)
    for (key in yearOfBirth.keys)
        println("$key = ${yearOfBirth.get(key)}")
    println()

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
    println(namesAndScores.plus("Bobby" to 10))
    println(namesAndScores.minus("Anna"))

    println(namesAndScores)
    for (key in namesAndScores.keys)
        println("$key = ${namesAndScores[key]}")
}
