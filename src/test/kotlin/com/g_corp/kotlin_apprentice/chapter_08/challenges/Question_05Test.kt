package com.g_corp.kotlin_apprentice.chapter_08.challenges

import org.junit.Assert
import org.junit.Test

public class Question_05Test {
    @Test
    fun testRandomInt() {
        val int_1 = randomInt(0, 5)
        val int_2 = randomInt(4, 9)
        val int_3 = randomInt(10, 20)
        Assert.assertTrue(int_1 in 0..5)
        Assert.assertTrue(int_2 in 4..9)
        Assert.assertTrue(int_3 in 10..20)
    }

    @Test
    fun testRandomize() {
        val array_1 = arrayOf(1, 2, 3)
        val array_2 = arrayOf(99, -1, 1000000000)
        var arrayToUse: Array<Int>

        for (i in 0 until 100) {
            arrayToUse = if (i % 2 == 0) array_1 else array_2
            Assert.assertNotEquals(arrayOf(1, 2, 3).joinToString(), randomize(arrayToUse).joinToString())
        }
    }
}
