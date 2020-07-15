package com.g_corp.kotlin_apprentice.chapter_11.challenges.question_01

import com.g_corp.kotlin_apprentice.chapter_11.challenges.question_01.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.challenges.question_01.models.User

fun main(args: Array<String>) {
    val name: FullName = FullName("Patrick", "Jack", "Black")
    val patrick: User = User(name)
    println(patrick)
}
