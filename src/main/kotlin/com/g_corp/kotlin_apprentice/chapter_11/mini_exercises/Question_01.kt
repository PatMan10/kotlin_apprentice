package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.Person

fun main(args: Array<String>) {
    val patrick = Person(FullName("Patrick", "Jr.", "Heynes"), 24)
    val homeOwner = patrick
    homeOwner.name.first = "Frank"
    patrick.introduce()
}
