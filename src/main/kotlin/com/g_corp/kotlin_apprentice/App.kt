package com.g_corp.kotlin_apprentice

enum class DayOfWeek(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saterday(true),
    Sunday(true);

    fun print() {
        println("${this.ordinal}: ${this.name} is weekend: ${this.isWeekend}")
    }
}

fun main(args: Array<String>) {
    println("${DayOfWeek.Monday}")
}
