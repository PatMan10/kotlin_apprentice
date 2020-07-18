package com.g_corp.kotlin_apprentice.chapter_14.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testSomething() {
        val circle_1 = Circle(2.0)
        Assert.assertEquals(12.57, circle_1.area, 0.0)
        circle_1.grow(2)
        Assert.assertEquals(4.0, circle_1.radius, 0.0)
        Assert.assertEquals(50.27, circle_1.area, 0.0)

        val circle_2 = Circle(4.0)
        Assert.assertEquals(50.27, circle_2.area, 0.0)
        circle_2.grow(3)
        Assert.assertEquals(12.0, circle_2.radius, 0.0)
        Assert.assertEquals(452.39, circle_2.area, 0.0)
    }
}
