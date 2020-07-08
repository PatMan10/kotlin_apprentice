package com.g_corp.kotlin_apprentice.chapter_08.challenges

import java.util.Random

fun main(args: Array<String>) {
    println("Chalenge Question")
}

fun randomInt(from: Int, to: Int): Int = Random().nextInt(to - from) + from

fun randomize(array: Array<Int>): Array<Int> {
    val randomizedArray = Array<Int>(array.size, { -1 })
    val newIndexes = Array<Int>(array.size, { -1 })
    var counter = 0
    var index = randomInt(0, array.size)

    while (counter < array.size) {
        if (newIndexes.contains(index))
            index = randomInt(0, array.size)
        else
            newIndexes[counter++] = index
    }
    for (i in 0 until newIndexes.size)
        randomizedArray[i] = array[newIndexes[i]]

    if (randomizedArray.joinToString() == array.joinToString())
        return randomize(array)

    return randomizedArray
}
