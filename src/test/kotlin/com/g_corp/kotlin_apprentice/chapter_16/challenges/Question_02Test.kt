package com.g_corp.kotlin_apprentice.chapter_16.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testNumberOfdaysTillWeekend() {
        Assert.assertEquals(1, DayOfWeek.Thursday.numberOfDaysTillWeekend)
        Assert.assertEquals(2, DayOfWeek.Wednesday.numberOfDaysTillWeekend)
        Assert.assertEquals(3, DayOfWeek.Tuesday.numberOfDaysTillWeekend)
        Assert.assertEquals(4, DayOfWeek.Monday.numberOfDaysTillWeekend)
        Assert.assertEquals(5, DayOfWeek.Sunday.numberOfDaysTillWeekend)
        Assert.assertEquals(6, DayOfWeek.Saterday.numberOfDaysTillWeekend)
        Assert.assertEquals(7, DayOfWeek.Friday.numberOfDaysTillWeekend)
    }
}
