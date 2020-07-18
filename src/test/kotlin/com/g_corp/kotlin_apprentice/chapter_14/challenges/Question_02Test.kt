package com.g_corp.kotlin_apprentice.chapter_14.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testSomething() {
        val date_1 = SimpleDate(Months.February, 27)
        date_1.advance()
        Assert.assertEquals(28, date_1.day)
        date_1.advance()
        Assert.assertEquals(1, date_1.day)

        val date_2 = SimpleDate(Months.January, 30)
        date_2.advance()
        Assert.assertEquals(31, date_2.day)
        date_2.advance()
        Assert.assertEquals(1, date_2.day)

        val date_3 = SimpleDate(Months.September, 29)
        date_3.advance()
        Assert.assertEquals(30, date_3.day)
        date_3.advance()
        Assert.assertEquals(1, date_3.day)
    }
}
