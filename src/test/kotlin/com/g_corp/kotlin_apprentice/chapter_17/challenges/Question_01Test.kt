package com.g_corp.kotlin_apprentice.chapter_17.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testTiger() {
        val tiger = Tiger(5)
        Assert.assertTrue(
            Regex("I eat").containsMatchIn(tiger.feed(Food.Meat))
        )
        Assert.assertEquals(0, tiger.hungerLevel)
    }
}
