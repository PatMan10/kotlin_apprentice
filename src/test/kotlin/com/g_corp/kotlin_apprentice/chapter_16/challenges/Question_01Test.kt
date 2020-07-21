package com.g_corp.kotlin_apprentice.chapter_16.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testGetDay() {
        val mondayByIndex = DayOfWeek.getDay(0)
        val mondayByName = DayOfWeek.getDay("Monday")
        Assert.assertEquals(DayOfWeek.Monday, mondayByIndex)
        Assert.assertEquals(DayOfWeek.Monday, mondayByName)

        Assert.assertEquals(null, DayOfWeek.getDay(-1))
        Assert.assertEquals(null, DayOfWeek.getDay(7))
        Assert.assertEquals(null, DayOfWeek.getDay("Zolday"))
    }
}
