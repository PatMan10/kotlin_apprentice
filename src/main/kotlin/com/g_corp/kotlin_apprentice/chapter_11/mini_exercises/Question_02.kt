package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_11.mini_exercises.models.Person

fun main(args: Array<String>) {
    println("Mini Exercise")
}

fun memberOf(personToSearchFor: Person, group: List<Person>): Boolean {
    for (person in group)
        if (personToSearchFor === person)
            return true

    return false
}
