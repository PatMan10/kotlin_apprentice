package com.g_corp.kotlin_apprentice.chapter_08.challenges

import org.junit.Assert
import org.junit.Test

public class Question_06Test {
    @Test
    fun testMinMax() {
        Assert.assertEquals(Pair(1, 10), minMax(arrayOf(1, 10, 2, 3, 4)))
        Assert.assertEquals(Pair(-2, 100), minMax(arrayOf(1, 10, -2, 3, 4, 100)))
        Assert.assertEquals(Pair(-100, 100), minMax(arrayOf(-100, 10, 2, 100, 4)))
    }
}
