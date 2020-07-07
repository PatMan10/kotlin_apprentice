package com.g_corp.kotlin_apprentice.chapter_06.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testFibonacci() {
        Assert.assertEquals(0, fibonacci(0))
        Assert.assertEquals(1, fibonacci(1))
        Assert.assertEquals(1, fibonacci(2))
        Assert.assertEquals(2, fibonacci(3))
        Assert.assertEquals(3, fibonacci(4))
        Assert.assertEquals(55, fibonacci(10))
    }
}
