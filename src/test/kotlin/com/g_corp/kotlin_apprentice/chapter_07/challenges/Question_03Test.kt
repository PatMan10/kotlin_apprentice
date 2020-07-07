package com.g_corp.kotlin_apprentice.chapter_07.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testGetMessage_03() {
        Assert.assertEquals("It divides 1 times.", getMessage_03(1))
        Assert.assertEquals("It divides 2 times.", getMessage_03(2))
        Assert.assertEquals("It divides 3 times.", getMessage_03(3))
    }

    @Test
    fun testDivideIfWhole_03() {
        // divisor = 0
        Assert.assertEquals(0, divideIfWhole_03(4, 0))
        Assert.assertEquals(0, divideIfWhole_03(3, 0))
        // non divisible
        Assert.assertEquals(0, divideIfWhole_03(3, 2))
        Assert.assertEquals(0, divideIfWhole_03(99, 4))
        // happy path
        Assert.assertEquals(2, divideIfWhole_03(4, 2))
        Assert.assertEquals(3, divideIfWhole_03(135, 3))
    }
}
