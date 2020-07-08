package com.g_corp.kotlin_apprentice

fun main(args: Array<String>) {
    println("App Running")

    val list = mutableListOf('a', 'b', 'c')
    list -= 'c'
    for ((i, c) in list.withIndex())
        println("i = $i c = $c")
}
