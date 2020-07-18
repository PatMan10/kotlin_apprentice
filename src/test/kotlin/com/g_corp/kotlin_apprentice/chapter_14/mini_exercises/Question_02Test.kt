package com.g_corp.kotlin_apprentice.chapter_14.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testFactorial() {
        Assert.assertEquals(6, MyMath.factorial(3))
        Assert.assertEquals(720, MyMath.factorial(6))
        Assert.assertEquals(362880, MyMath.factorial(9))
    }

    @Test
    fun testTriangle() {
        Assert.assertEquals(10, MyMath.traingle(4))
        Assert.assertEquals(15, MyMath.traingle(5))
        Assert.assertEquals(21, MyMath.traingle(6))
    }
}
