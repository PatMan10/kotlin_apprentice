package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testFilterLessThan() {
        val namesAndAges = mapOf("Patrick" to 24, "John" to 28, "Faith" to 13, "Byronique" to 5)
        Assert.assertEquals(namesAndAges.filter({ it -> it.value < 30 }), filterLessThan(30, namesAndAges))
        Assert.assertEquals(namesAndAges.filter({ it -> it.value < 28 }), filterLessThan(28, namesAndAges))
        Assert.assertEquals(namesAndAges.filter({ it -> it.value < 18 }), filterLessThan(18, namesAndAges))
    }
}
