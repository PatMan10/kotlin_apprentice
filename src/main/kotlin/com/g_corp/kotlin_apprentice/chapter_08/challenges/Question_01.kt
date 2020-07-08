package com.g_corp.kotlin_apprentice.chapter_08.challenges

fun main(args: Array<String>) {
    println("val array1 = Array<Int>() -> invalid, no argument passed for size or init parameter")
    println("val array2 = arrayOf() -> invalid, not enough info to infer type of array elements")
    println("val array3: Array<Stringt> = arrayOf() -> valid")
    println()

    println("val array4 = arrayOf(1, 2, 3)")
    println("println(array4[0]) -> valid")
    println("println(array4[5]) -> invalid, index 5 is out of range")
    println("arary4[0] = 4 -> invalid, array is imutable")
    println()

    println("val array5 = arrayOf(1, 2, 3)")
    println("array5[0] = array5[1] -> invalid, array is imutable")
    println("array5[0] = \"Six\" -> invalid, array is imutable and array only takes Int not String")
    println("array5 += 6 -> invalid, array is imutable")
    println("for (item in array5) println(item) -> valid")
}
