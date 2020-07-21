package com.g_corp.kotlin_apprentice.chapter_17.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testAreaInterface() {
        val square = Square(4.0)
        val triangle = Triangle(2.0, 4.0)
        val circle = Circle(2.0)
        Assert.assertEquals(16.0, square.area, 0.0)
        Assert.assertEquals(4.0, triangle.area, 0.0)
        Assert.assertEquals(12.57, circle.area, 0.0)
    }

    @Test
    fun testInterfacePolymorphism() {
        val shapes = listOf<Shape>(
            Square(4.0),
            Triangle(2.0, 4.0),
            Circle(2.0)
        )
        val areas = shapes.map({ it })
        Assert.assertEquals(shapes, areas)
    }
}
