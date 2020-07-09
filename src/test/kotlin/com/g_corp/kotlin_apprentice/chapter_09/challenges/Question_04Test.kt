package com.g_corp.kotlin_apprentice.chapter_09.challenges

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testOccurrencesOfCharacters() {
        Assert.assertEquals(mapOf('a' to 5, 'b' to 1), occurrencesOfCharacters("aaaaab"))
    }
}
