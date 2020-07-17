package com.g_corp.kotlin_apprentice.chapter_13.challenges

import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testIceCreamClass() {
        val ice_1 = IceCream()
        val ice_2 = IceCream("Strawberry")
        val ice_3 = IceCream("Vanilla")

        ice_3.ingredients.add("Milk")
        ice_3.ingredients.add("Sugar")

        Assert.assertEquals("Chocolate", ice_1.name)
        Assert.assertNotNull(ice_1.ingredients)
        Assert.assertEquals(0, ice_1.ingredients.size)

        Assert.assertEquals("Strawberry", ice_2.name)
        Assert.assertNotNull(ice_2.ingredients)
        Assert.assertEquals(0, ice_2.ingredients.size)

        Assert.assertEquals("Vanilla", ice_3.name)
        Assert.assertNotNull(ice_3.ingredients)
        Assert.assertEquals(2, ice_3.ingredients.size)
        Assert.assertTrue(ice_3.ingredients.contains("Milk"))
        Assert.assertTrue(ice_3.ingredients.contains("Sugar"))
    }
}
