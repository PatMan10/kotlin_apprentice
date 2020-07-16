package com.g_corp.kotlin_apprentice.chapter_12.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testThresholdChecker() {
        val checker = object : ThresholdChecker {
            override val lowerLimit = 5
            override val upperLimit = 20

            override fun isAbove(value: Int) = value > upperLimit
            override fun isBelow(value: Int) = value < lowerLimit
            override fun isIn(value: Int) = value >= lowerLimit && value <= upperLimit
        }

        Assert.assertTrue(checker.isAbove(30))
        Assert.assertFalse(checker.isAbove(20))

        Assert.assertTrue(checker.isBelow(1))
        Assert.assertFalse(checker.isBelow(20))

        Assert.assertTrue(checker.isIn(19))
        Assert.assertFalse(checker.isIn(21))
    }
}
