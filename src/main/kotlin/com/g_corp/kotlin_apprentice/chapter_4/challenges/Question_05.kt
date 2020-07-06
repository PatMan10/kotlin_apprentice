package com.g_corp.kotlin_apprentice.chapter_04.challenges

fun main(args: Array<String>) {
    val month = "march"
    val year = 2020
    var numberOfDays: Int

    if (month.equals("february"))
        numberOfDays = if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 29 else 28
    else if (month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november"))
        numberOfDays = 30
    else
        numberOfDays = 31
    println("$month has $numberOfDays days in $year")
}
