package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testConcatenateLongerThan() {
        Assert.assertEquals("aaaaccccc", concatenateLongerThan(3, listOf("aaaa", "bb", "ccccc")))
        Assert.assertEquals("aaaabbccccc", concatenateLongerThan(1, listOf("aaaa", "bb", "ccccc")))
        Assert.assertEquals("aaaabbcccccz", concatenateLongerThan(0, listOf("aaaa", "bb", "ccccc", "z")))
    }
}
