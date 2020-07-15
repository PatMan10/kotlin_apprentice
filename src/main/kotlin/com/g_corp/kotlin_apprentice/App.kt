package com.g_corp.kotlin_apprentice

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.Person

fun main(args: Array<String>) {
    val people = (1..100).map({ Person(FullName("firstName_$it", "middleName_$it", "lastName_$it"), it) })
    people.forEach({ it.introduce() })
}
