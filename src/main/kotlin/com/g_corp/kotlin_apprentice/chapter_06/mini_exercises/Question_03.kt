package com.g_corp.kotlin_apprentice.chapter_06.mini_excercises

fun main(args: Array<String>) {
    println(calculateFullName())
    println(calculateFullName("Patrick", "Heynes"))
    println(calculateFullName(firstName = "Dwayne", lastName = "Johnson"))
    println(calculateFullName(lastName = "Hood", firstName = "Robin"))
}

fun calculateFullName(
    firstName: String = "Siya",
    lastName: String = "Kolisi"
) = "$firstName $lastName"
