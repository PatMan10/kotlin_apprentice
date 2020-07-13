package com.g_corp.kotlin_apprentice.chapter_10.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testCalculateAverages() {
        val map1 = mapOf("flappy bird" to arrayOf(1, 2, 3), "mr delivery" to arrayOf(2, 4, 6))
        val map1Averages = mapOf("flappy bird" to 2.0, "mr delivery" to 4.0)
        Assert.assertEquals(map1Averages, calculateAverages(map1))

        val map2 = mapOf("facebook" to arrayOf(1, 1, 1), "whatsapp" to arrayOf(2, 2, 2))
        val map2Averages = mapOf("facebook" to 1.0, "whatsapp" to 2.0)
        Assert.assertEquals(map2Averages, calculateAverages(map2))
    }

    @Test
    fun testFilterRatingsGreaterThan() {
        val map1Averages = mapOf("flappy bird" to 2.0, "mr delivery" to 4.0)
        Assert.assertEquals(listOf("mr delivery"), filterRatingGreaterThan(2, map1Averages))

        val map2Averages = mapOf("facebook" to 1.0, "whatsapp" to 2.0)
        Assert.assertEquals(listOf("facebook", "whatsapp"), filterRatingGreaterThan(0, map2Averages))
    }
}
