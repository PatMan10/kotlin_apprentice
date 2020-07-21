package com.g_corp.kotlin_apprentice.chapter_16.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

class DayOfWeekIndex(var index: Int = 0) {
    fun increment() {
        this.index++
        if (this.index.equals(7))
            this.index = 0
    }
}

enum class DayOfWeek(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saterday(true),
    Sunday(true);

    companion object {
        fun getDay(index: Int): DayOfWeek? {
            val indexInRange = index >= 0 && index < DayOfWeek.values().size
            return if (indexInRange)
                DayOfWeek.values().get(index)
            else null
        }

        fun getDay(name: String): DayOfWeek? {
            for (day in DayOfWeek.values())
                if (name.equals(day.toString()))
                    return day
            return null
        }
    }

    val numberOfDaysTillWeekend: Int
        get() {
            val days = DayOfWeek.values()
            var count = 1
            var dayOfWeekIndex = DayOfWeekIndex(days.indexOf(this))
            dayOfWeekIndex.increment()

            while (DayOfWeek.Friday != days.get(dayOfWeekIndex.index)) {
                count++
                dayOfWeekIndex.increment()
            }
            return count
        }

    fun print() {
        println("${this.ordinal}: ${this.name} is weekend: ${this.isWeekend}")
    }
}
