package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    // lastName is defined within the scope the if expresion
    // but is being use within the parent scope, therefore
    // it gives an unresolved refference error

    /*val firstName = "Patrick"
    if (firstName == "Patrick") {
        val lastName = "Heynes"
    } else if (firstName == "Eliot") {
        val lastName = "Alderson"
    } else {
        val lastName = "ButKiss"
    }
    val fullName = "$firstName $lastName"*/

    val firstName = "Patrick"
    val lastName: String
    if (firstName == "Patrick") {
        lastName = "Heynes"
    } else if (firstName == "Eliot") {
        lastName = "Alderson"
    } else {
        lastName = "ButKiss"
    }
    val fullName = "$firstName $lastName"
    println(fullName)
}
