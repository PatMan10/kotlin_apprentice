package com.g_corp.kotlin_apprentice.chapter_13.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testCustomGetterDiagonal() {
        val tv_1 = TV(15.7, 27.9)
        val tv_2 = TV(19.6, 34.9)

        Assert.assertEquals(32, tv_1.diagonal)
        Assert.assertEquals(40, tv_2.diagonal)
    }
}
