package com.g_corp.kotlin_apprentice.chapter_14.mini_exercises

fun main(args: Array<String>) {
    println("Mini Exercise")
    SimpleDate(Days.Monday, Months.January, 2020)
}

enum class Days {
    Sunday, Monday,
    Tuesday, Wednesday,
    Thursday, Friday,
    Saterday
}

enum class Months {
    January, February,
    March, April,
    May, June,
    July, August,
    September, October,
    November, December
}

class SimpleDate(var day: Days, var month: Months, var year: Int) {
    val monthsUntilSummerBreak: Int
        get() {
            val months = Months.values()
            return months.indexOf(Months.December) - months.indexOf(this.month) + 1
        }
}
