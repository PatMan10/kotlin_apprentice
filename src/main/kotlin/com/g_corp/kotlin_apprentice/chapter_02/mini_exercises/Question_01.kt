package com.g_corp.kotlin_apprentice.chapter_02.mini_exercises

const val satansAge: Int = 2020

fun main(args: Array<String>) {
    val myAge: Int = 24
    println("myAge = $myAge")
    println("myAge is a local constant via the val keyword")
    println("satansAge = $satansAge")
    println("satansAge is a top level constant via the const and val keywords")
}
