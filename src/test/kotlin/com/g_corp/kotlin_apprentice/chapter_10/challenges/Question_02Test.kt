package com.g_corp.kotlin_apprentice.chapter_10.challenges

import com.g_corp.kotlin_apprentice.chapter_06.challenges.fibonacci
import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testMathSum() {
        Assert.assertEquals(6, mathSum(2, { it + it }))
        Assert.assertEquals(385, mathSum(10, { it * it }))
        Assert.assertEquals(143, mathSum(10, { fibonacci(it) }))
    }
}
