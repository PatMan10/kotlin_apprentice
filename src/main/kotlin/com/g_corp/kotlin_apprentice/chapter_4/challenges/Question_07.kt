package com.g_corp.kotlin_apprentice.chapter_4.challenges

fun main(args: Array<String>) {
    var number = 1
    var result: Int
    var spaceCounter: Int
    var borderCounter: Int
    val limit = 10
    val lengthOfBiggestNumberInFirstColumn = limit.toString().length
    val lengthOfBiggestNumberInSecondColumn = (limit * limit).toString().length
    val lengthOfTopAndBottomBorders = lengthOfBiggestNumberInFirstColumn + lengthOfBiggestNumberInSecondColumn + 3

    // loop to print top border
    borderCounter = lengthOfTopAndBottomBorders
    println("powers of 2")
    while (borderCounter > 0) {
        print("_")
        borderCounter--
    }
    println()

    do {
        spaceCounter = lengthOfBiggestNumberInFirstColumn - number.toString().length

        print("|$number")
        // loop to print trailing spaces first column
        while (spaceCounter > 0) {
            print(" ")
            spaceCounter--
        }

        result = number * number
        spaceCounter = lengthOfBiggestNumberInSecondColumn - result.toString().length

        print("|$result")
        // loop to print trailing spaces second column
        while (spaceCounter > 0) {
            print(" ")
            spaceCounter--
        }
        println("|")
        number++
    } while (number <= limit)

    // loop to print top border
    borderCounter = lengthOfTopAndBottomBorders
    while (borderCounter > 0) {
        print("_")
        borderCounter--
    }
    println()
}
