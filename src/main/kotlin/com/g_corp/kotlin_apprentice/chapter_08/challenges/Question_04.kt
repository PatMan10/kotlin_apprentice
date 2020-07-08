package com.g_corp.kotlin_apprentice.chapter_08.challenges

fun main(args: Array<String>) {
    println("Chalenge Question")
}

fun reverse(array: Array<Int>): Array<Int> {
    var reversedArray: Array<Int> = Array<Int>(array.size, { 0 })
    var index = 0

    for (i in array.size - 1 downTo 0)
        reversedArray[index++] = array[i]
    return reversedArray
}
