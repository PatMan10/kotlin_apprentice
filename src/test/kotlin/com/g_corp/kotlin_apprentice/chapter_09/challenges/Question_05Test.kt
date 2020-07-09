package com.g_corp.kotlin_apprentice.chapter_09.challenges

import org.junit.Assert
import org.junit.Test

public class Question_05Test {
    @Test
    fun testValuesAreUnique() {
        val map1 = mapOf("a" to 1)
        val map2 = mapOf("a" to 1, "b" to 2)
        val map3 = mapOf("a" to 1, "b" to 2, "c" to 1)
        val map4 = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 3)

        Assert.assertTrue(valuesAreUnique(map1))
        Assert.assertTrue(valuesAreUnique(map2))
        Assert.assertTrue(!valuesAreUnique(map3))
        Assert.assertTrue(!valuesAreUnique(map4))
    }
}
