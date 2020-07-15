package com.g_corp.kotlin_apprentice.chapter_11.challenges

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.User

fun main(args: Array<String>) {
    val name: FullName = FullName("Patrick", "Jack", "Black")
    val patrick: User = User(name)
    println(patrick)
}
