package com.g_corp.kotlin_apprentice.chapter_14.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testMyMathClass() {
        Assert.assertFalse(MyMath.isEven(1))
        Assert.assertFalse(MyMath.isEven(3))
        Assert.assertFalse(MyMath.isEven(5))

        Assert.assertTrue(MyMath.isEven(2))
        Assert.assertTrue(MyMath.isEven(4))
        Assert.assertTrue(MyMath.isEven(6))

        Assert.assertTrue(MyMath.isOdd(1))
        Assert.assertTrue(MyMath.isOdd(3))
        Assert.assertTrue(MyMath.isOdd(5))

        Assert.assertFalse(MyMath.isOdd(2))
        Assert.assertFalse(MyMath.isOdd(4))
        Assert.assertFalse(MyMath.isOdd(6))
    }
}
