package com.g_corp.kotlin_apprentice.chapter_3.challenges

fun main(args: Array<String>) {
    // cannot reassign a variable declared with val
    // val name = "Dick"
    // name += "Lucas"

    // can reassign a variable declared with var
    var name = "Patrick"
    name += " Heynes"
    println("name = $name")
}
