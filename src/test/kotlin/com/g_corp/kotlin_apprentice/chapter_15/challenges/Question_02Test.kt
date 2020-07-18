package com.g_corp.kotlin_apprentice.chapter_15.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testInheritanceAndCasting() {
        val d = D()
        val a = d as A
        val b = d as B
        val c = d as C

        Assert.assertTrue(a is A)
        Assert.assertTrue(b is B)
        Assert.assertTrue(c is C)

        var a2: A
        try {
            a2 = A() as C
            println(a2.javaClass.name)
        } catch (e: Exception) {
            val regex = Regex("cannot be cast to class")
            println("------------------------------------${e.message}------------------------------------")
            Assert.assertTrue(regex.containsMatchIn(e.message as CharSequence))
        }
    }
}
