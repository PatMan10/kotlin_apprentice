package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.nullable_types

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testPareInt() {
        val intOrNull_1 = "10"
        val intOrNull_2 = "1"
        val intOrNull_3 = "1aaaa"
        val intOrNull_4 = "null"

        Assert.assertEquals(10, parseInt(intOrNull_1))
        Assert.assertEquals(1, parseInt(intOrNull_2))
        Assert.assertEquals(null, parseInt(intOrNull_3))
        Assert.assertEquals(null, parseInt(intOrNull_4))
    }
}
