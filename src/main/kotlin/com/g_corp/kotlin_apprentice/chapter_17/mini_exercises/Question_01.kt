package com.g_corp.kotlin_apprentice.chapter_17.mini_exercises

fun main(args: Array<String>) {
    println("Mini Exercise")
}

fun round(number: Double): Double = Math.round(number * 100) / 100.0

interface Area {
    val area: Double
}

interface Shape {
    val name: String
}

class Square(val sideLength: Double) : Area, Shape {
    override val name: String = "Square"

    override val area: Double
        get() = round(sideLength * sideLength)
}

class Triangle(val base: Double, val height: Double) : Area, Shape {
    override val name: String = "Triangle"

    override val area: Double
        get() = round((base * height) / 2)
}

class Circle(val radius: Double) : Area, Shape {
    override val name: String = "Circle"

    override val area: Double
        get() = round((radius * radius) * Math.PI)
}
