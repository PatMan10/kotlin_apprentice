package com.g_corp.kotlin_apprentice.chapter_14.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

enum class Months {
    January, February,
    March, April,
    May, June,
    July, August,
    September, October,
    November, December
}

class SimpleDate(var month: Months, var day: Int = 1) {
    fun advance() {
        when (this.month) {
            Months.February ->
                if (this.day < 28) this.day += 1 else this.day = 1

            Months.January, Months.March,
            Months.May, Months.July,
            Months.August, Months.October,
            Months.December ->
                if (this.day < 31) this.day += 1 else this.day = 1

            else -> if (this.day < 30) this.day += 1 else this.day = 1
        }
    }
}
