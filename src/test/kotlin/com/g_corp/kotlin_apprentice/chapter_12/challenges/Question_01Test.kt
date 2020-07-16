package com.g_corp.kotlin_apprentice.chapter_12.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testIsAboveThreshold() {
        Assert.assertFalse(Threshold.isAboveThreshold(1))
        Assert.assertFalse(Threshold.isAboveThreshold(2))
        Assert.assertFalse(Threshold.isAboveThreshold(3))
        Assert.assertTrue(Threshold.isAboveThreshold(11))
        Assert.assertTrue(Threshold.isAboveThreshold(12))
        Assert.assertTrue(Threshold.isAboveThreshold(13))
    }
}
