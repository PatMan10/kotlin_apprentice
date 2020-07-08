package com.g_corp.kotlin_apprentice.chapter_08.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testRemove() {
        Assert.assertEquals(listOf(2, 3), remove(1, listOf(1, 2, 1, 3, 1)))
        Assert.assertEquals(listOf(1, 3), remove(2, listOf(2, 1, 2, 2, 3, 2)))
        Assert.assertEquals(listOf(1, 2), remove(3, listOf(3, 3, 3, 1, 2, 3)))
    }
}
