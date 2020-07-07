package com.g_corp.kotlin_apprentice.chapter_05.challenges

fun main(args: Array<String>) {
    val number_1 = 0
    val number_2 = 0
    val range = number_1..number_2

    println("number_1 = $number_1")
    println("number_2 = $number_2\n")

    println("going into loop...")
    for (i in range)
        println("interation $i")

    println()
    println(
        """A closed range can never be empty because the second number must be 
        >= the first number, which means there will always be atleast one number in the range."""
    )
}
