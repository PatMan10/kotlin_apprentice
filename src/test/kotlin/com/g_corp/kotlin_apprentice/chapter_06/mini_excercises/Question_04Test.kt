package com.g_corp.kotlin_apprentice.chapter_06.mini_excercises

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testCalculateFullNameAndLength() {
        val fullName_1 = "Bruce Wayne"
        val fullName_2 = "Patrick Heynes"
        val fullName_3 = "Bob Sap"
        val fullName_4 = "Eliot Alderson"

        val nameLengthPair_1 = calculateFullNameAndLength()
        val nameLengthPair_2 = calculateFullNameAndLength("Patrick", "Heynes")
        val nameLengthPair_3 = calculateFullNameAndLength(firstName = "Bob", lastName = "Sap")
        val nameLengthPair_4 = calculateFullNameAndLength(lastName = "Alderson", firstName = "Eliot")

        Assert.assertEquals(Pair(fullName_1, fullName_1.length), nameLengthPair_1)
        Assert.assertEquals(Pair(fullName_2, fullName_2.length), nameLengthPair_2)
        Assert.assertEquals(Pair(fullName_3, fullName_3.length), nameLengthPair_3)
        Assert.assertEquals(Pair(fullName_4, fullName_4.length), nameLengthPair_4)
    }
}
