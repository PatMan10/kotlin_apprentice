package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.checking_for_null

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testGetSongMesage() {
        Assert.assertEquals("No song at index 0, got null instead.", getSongMessage(0))
        Assert.assertEquals("Song at index 1 is \"Lenny Kravitz - Fly Away\".", getSongMessage(1))
        Assert.assertEquals("Song at index 2 is \"Lenny Kravitz - Are You Gonna Go My Way\".", getSongMessage(2))
        Assert.assertEquals("No song at index 5, got null instead.", getSongMessage(5))
        Assert.assertEquals("No song at index 6, got null instead.", getSongMessage(6))
        Assert.assertEquals("Song at index 7 is \"Lil Wayne - Gun Walk\".", getSongMessage(7))
    }
}
