package com.g_corp.kotlin_apprentice.chapter_10.mini_exercises

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testFilterGreaterThan() {
        val namesAndAges = mapOf("Patrick" to 24, "John" to 28, "Faith" to 13, "Byronique" to 5)
        Assert.assertEquals(namesAndAges.filter({ it -> it.value > 30 }), filterGreaterThan(30, namesAndAges))
        Assert.assertEquals(namesAndAges.filter({ it -> it.value > 28 }), filterGreaterThan(28, namesAndAges))
        Assert.assertEquals(namesAndAges.filter({ it -> it.value > 18 }), filterGreaterThan(18, namesAndAges))
    }

    fun testGetKeys() {
        val map1 = mapOf("Patrick" to 24, "John" to 28, "Faith" to 13, "Byronique" to 5)
        val map2 = mapOf("a" to 2, "b" to 8, "c" to 10, "z" to 5)
        Assert.assertEquals(map1.keys, getKeys(map1))
        Assert.assertEquals(map2.keys, getKeys(map2))
    }
}
