package com.g_corp.kotlin_apprentice.chapter_07.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testGetMessage_02() {
        Assert.assertEquals("Yep, it divides 1 times.", getMessage_02(1))
        Assert.assertEquals("Yep, it divides 2 times.", getMessage_02(2))
        Assert.assertEquals("Yep, it divides 3 times.", getMessage_02(3))
        Assert.assertEquals("Not divisible. :[", getMessage_02(null))
        Assert.assertEquals("Not divisible. :[", getMessage_02(null))
    }

    @Test
    fun testDivideIfWhole_02() {
        // divisor = 0
        Assert.assertEquals(null, divideIfWhole_02(4, 0))
        Assert.assertEquals(null, divideIfWhole_02(3, 0))
        // non divisible
        Assert.assertEquals(null, divideIfWhole_02(3, 2))
        Assert.assertEquals(null, divideIfWhole_02(99, 4))
        // happy path
        Assert.assertEquals(2, divideIfWhole_02(4, 2))
        Assert.assertEquals(3, divideIfWhole_02(135, 3))
    }
}
