package com.g_corp.kotlin_apprentice.chapter_06.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testIsDivisible() {
        Assert.assertTrue(isDivisible(10, 2))
        Assert.assertTrue(isDivisible(55, 5))
        Assert.assertFalse(isDivisible(10, 3))
        Assert.assertFalse(isDivisible(20, 0))
    }

    @Test
    fun testIsPrime() {
        Assert.assertTrue(isPrime(3))
        Assert.assertTrue(isPrime(13))
        Assert.assertTrue(isPrime(8893))
        Assert.assertFalse(isPrime(6))
        Assert.assertFalse(isPrime(16))
        Assert.assertFalse(isPrime(4))
    }
}
