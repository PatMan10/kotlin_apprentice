package com.g_corp.kotlin_apprentice.chapter_04.mini_exercises.loops

import kotlin.random.Random

fun main(args: Array<String>) {
    var numberOfRolls = 0
    var currentRoll: Int
    var s: String
    do {
        currentRoll = Random.nextInt(6)
        numberOfRolls++
        s = if (numberOfRolls > 1) "s" else ""
        println("After $numberOfRolls roll$s, roll is $currentRoll")
    } while (currentRoll != 0)
}
