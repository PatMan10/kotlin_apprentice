package com.g_corp.kotlin_apprentice.chapter_15.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testSomething() {
        val a = A()
        val b = B()
        val c = C()
        val d = D()
        Assert.assertEquals("AAA", a.name)
        Assert.assertEquals("BBB", b.name)
        Assert.assertEquals("CCC", c.name)
        Assert.assertEquals("DDD", d.name)
    }
}
