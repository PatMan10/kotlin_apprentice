package com.g_corp.kotlin_apprentice.chapter_14.challenges

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testExtensionMethods() {
        fun Int.isEven() = this % 2 == 0
        fun Int.isOdd() = this % 2 != 0

        Assert.assertTrue(1.isOdd())
        Assert.assertTrue(3.isOdd())
        Assert.assertTrue(5.isOdd())

        Assert.assertFalse(1.isEven())
        Assert.assertFalse(3.isEven())
        Assert.assertFalse(5.isEven())

        Assert.assertTrue(2.isEven())
        Assert.assertTrue(4.isEven())
        Assert.assertTrue(6.isEven())

        Assert.assertFalse(2.isOdd())
        Assert.assertFalse(4.isOdd())
        Assert.assertFalse(6.isOdd())
    }
}
