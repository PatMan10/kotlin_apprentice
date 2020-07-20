package com.g_corp.kotlin_apprentice.chapter_15.challenges

import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.FullName
import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.Person

fun main(args: Array<String>) {
    val arnold = Person(FullName("Arnold", "Jack", "Black"), 25)
    println(arnold.introduction)
}
