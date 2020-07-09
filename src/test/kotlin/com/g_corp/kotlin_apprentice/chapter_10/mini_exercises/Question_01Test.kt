package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testConcatenate() {
        Assert.assertEquals("aabbcc", concatenate(listOf("aa", "bb", "cc")))
        Assert.assertEquals("aabbcc", concatenate(listOf("aabb", "cc")))
        Assert.assertEquals("1_1_1", concatenate(listOf("1_1_", "1")))
    }
}
