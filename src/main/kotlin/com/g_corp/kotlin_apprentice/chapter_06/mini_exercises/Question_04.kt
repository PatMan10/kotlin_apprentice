package com.g_corp.kotlin_apprentice.chapter_06.mini_excercises

fun main(args: Array<String>) {
    val name_1 = calculateFullNameAndLength()
    val name_2 = calculateFullNameAndLength("Patrick", "Heynes")
    val name_3 = calculateFullNameAndLength(lastName = "Swarts", firstName = "Charl")
    val name_4 = calculateFullNameAndLength(firstName = "Bongani", lastName = "Vuma")

    println("${name_1.second} ${name_1.first}")
    println("${name_2.second} ${name_2.first}")
    println("${name_3.second} ${name_3.first}")
    println("${name_4.second} ${name_4.first}")
}

fun calculateFullNameAndLength(firstName: String = "Bruce", lastName: String = "Wayne"): Pair<String, Int> {
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length)
}
