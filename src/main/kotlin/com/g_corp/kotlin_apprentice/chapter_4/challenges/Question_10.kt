package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    val number = 8
    var die1 = 1
    var die2 = 1
    var numberOfHits = 0

    while (die1 <= 6) {
        while (die2 <= 6) {
            if (die1 + die2 == number)
                numberOfHits++
            die2++
        }
        die2 = 1
        die1++
    }
    println("$numberOfHits out of 12 chance of rolling $number")
}
