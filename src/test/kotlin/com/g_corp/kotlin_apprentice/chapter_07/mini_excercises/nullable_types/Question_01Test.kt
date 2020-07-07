package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.nullable_types

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testGetSong() {
        Assert.assertEquals(null, getSong(0))
        Assert.assertEquals("Lenny Kravitz - Fly Away", getSong(1))
        Assert.assertEquals("Lenny Kravitz - Are You Gonna Go My Way", getSong(2))
        Assert.assertEquals(null, getSong(5))
        Assert.assertEquals(null, getSong(6))
        Assert.assertEquals("Lil Wayne - Gun Walk", getSong(7))
    }
}
