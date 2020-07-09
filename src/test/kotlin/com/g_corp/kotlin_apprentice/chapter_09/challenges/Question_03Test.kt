package com.g_corp.kotlin_apprentice.chapter_09.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testMergeMaps() {
        val maps = arrayOf(
            mapOf("a" to "apple"),
            mapOf("a" to "apricot", "b" to "banana"),
            mapOf("c" to "cherry"),
            mapOf("d" to "date")
        )

        Assert.assertEquals(mapOf("a" to "apple"), mergeMaps(maps.slice(0..0)))
        Assert.assertEquals(mapOf("a" to "apricot", "b" to "banana"), mergeMaps(maps.slice(0..1)))
        Assert.assertEquals(mapOf("a" to "apricot", "b" to "banana", "c" to "cherry"), mergeMaps(maps.slice(0..2)))
        Assert.assertEquals(mapOf("a" to "apricot", "b" to "banana", "c" to "cherry", "d" to "date"), mergeMaps(maps.slice(0 until maps.size)))
    }
}
