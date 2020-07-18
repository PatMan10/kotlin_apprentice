package com.g_corp.kotlin_apprentice.chapter_14.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testSimpleDateClass() {
        val date_1 = SimpleDate(Days.Friday, Months.July, 2020)
        val date_2 = SimpleDate(Days.Wednesday, Months.September, 2020)
        Assert.assertEquals(6, date_1.monthsUntilSummerBreak)
        Assert.assertEquals(4, date_2.monthsUntilSummerBreak)
    }
}
