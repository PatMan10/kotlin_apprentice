package com.g_corp.kotlin_apprentice.chapter_06.mini_excercises

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testCalculateFullName() {
        val name_1 = calculateFullName()
        val name_2 = calculateFullName("Patrick", "Heynes")
        val name_3 = calculateFullName(firstName = "Patrick", lastName = "Heynes")
        val name_4 = calculateFullName(lastName = "Heynes", firstName = "Patrick")

        Assert.assertEquals("names match", "Siya Kolisi", name_1)
        Assert.assertEquals("names match", "Patrick Heynes", name_2)
        Assert.assertEquals("names match", "Patrick Heynes", name_3)
        Assert.assertEquals("names match", "Patrick Heynes", name_4)
    }
}
