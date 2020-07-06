package com.g_corp.kotlin_apprentice.chapter_04.challenges

fun main(args: Array<String>) {
    val number = 8
    var counter = number - 2
    var a = 1
    var b = 1
    var c: Int = -99
    var sequence = "$a $b"
    while (counter > 0) {
        c = a + b
        sequence += " $c"
        a = b
        b = c
        counter--
    }
    println("fib($number) = $c")
    println(sequence)
}
