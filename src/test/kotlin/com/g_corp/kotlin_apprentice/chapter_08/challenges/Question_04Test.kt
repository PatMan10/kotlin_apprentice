package com.g_corp.kotlin_apprentice.chapter_08.challenges

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testReverse() {
        val array_1 = arrayOf(1, 2, 3)
        val array_2 = arrayOf(3, 2, 1)
        val array_3 = arrayOf(9, 2, 3, 6)
        Assert.assertEquals(arrayOf(3, 2, 1).joinToString(), reverse(array_1).joinToString())
        Assert.assertEquals(arrayOf(1, 2, 3).joinToString(), reverse(array_2).joinToString())
        Assert.assertEquals(arrayOf(6, 3, 2, 9).joinToString(), reverse(array_3).joinToString())
    }
}
