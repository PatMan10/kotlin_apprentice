package com.g_corp.kotlin_apprentice

import com.g_corp.kotlin_apprentice.chapter_14.mini_exercises.MyMath

fun main(args: Array<String>) {
    fun MyMath.Companion.add(a: Int, b: Int) = a + b
    fun MyMath.Companion.multiply(a: Int, b: Int) = a * b

    println(MyMath.add(1, 2))
    println(MyMath.multiply(2, 2))
}
