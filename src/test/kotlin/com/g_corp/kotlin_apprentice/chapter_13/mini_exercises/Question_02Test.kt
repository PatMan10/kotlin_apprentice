package com.g_corp.kotlin_apprentice.chapter_13.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testLazyPropertyArea() {
        val circle_1 = Circle(6.0)
        val circle_2 = Circle(3.0)

        Assert.assertEquals(113.1, circle_1.area, 0.0)
        Assert.assertEquals(28.27, circle_2.area, 0.0)
    }
}
