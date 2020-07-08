package com.g_corp.kotlin_apprentice.chapter_08.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testRemoveOne() {
        Assert.assertEquals(listOf(2, 3), removeOne(1, listOf(1, 2, 3)))
        Assert.assertEquals(listOf(1, 3), removeOne(2, listOf(1, 2, 3)))
        Assert.assertEquals(listOf(1, 2), removeOne(3, listOf(1, 2, 3)))
    }
}
