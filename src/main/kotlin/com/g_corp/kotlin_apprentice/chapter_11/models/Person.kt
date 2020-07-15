package com.g_corp.kotlin_apprentice.chapter_11.models

class Person(val name: FullName, var age: Int) {
    fun introduce() = println("Hi my name is ${this.name}, nice to meet you.")
}
