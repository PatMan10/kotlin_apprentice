package com.g_corp.kotlin_apprentice.chapter_11.challenges

import com.g_corp.kotlin_apprentice.chapter_11.challenges.question_02.models.*
import org.junit.Assert
import org.junit.Test

public class Question_02Test {

    @Test
    fun testDataClasses() {
        val user_1 = User(
            Address("Cape Town", "Long Street", 6219),
            ContactInfo("user_1@here.com", "12345678899", "0987654321"),
            FullName("Gino", "", "Douglas")
        )
        val tShirtIn = TShirt("black", false, 6.2, 'l')
        val tShirtOut = TShirt("white", true, 1.0, 's')

        user_1.shoppingCart.addItem(tShirtOut)
        user_1.shoppingCart.removeItem(tShirtOut)
        user_1.shoppingCart.addItem(tShirtIn)
        user_1.shoppingCart.removeItem(tShirtIn)
        user_1.shoppingCart.addItem(TShirt("red", true, 5.2, 'l'))
        user_1.shoppingCart.addItem(TShirt("yellow", false, 3.2, 'l'))
        user_1.shoppingCart.addItem(TShirt("green", true, 1.2, 'l'))

        Assert.assertEquals(3, user_1.shoppingCart.items.size)
        Assert.assertEquals(9.6, user_1.shoppingCart.calculateTotal(), 0.0)
        Assert.assertFalse(user_1.shoppingCart.items.contains(tShirtIn))
        Assert.assertFalse(user_1.shoppingCart.items.contains(tShirtOut))

        val user_2 = User(
            Address("Pretoria", "Hairbell", 666),
            ContactInfo("user_2@here.com", "0000000001", "1111111110"),
            FullName("Fred", "Jr.", "Friday")
        )

        user_2.shoppingCart.addItem(tShirtOut)
        user_2.shoppingCart.addItem(tShirtIn)
        user_2.shoppingCart.addItem(TShirt("blue", false, 1.1, 'l'))
        user_2.shoppingCart.addItem(TShirt("pink", true, 4.1, 'l'))
        user_2.shoppingCart.addItem(TShirt("siver", false, 2.2, 'l'))

        Assert.assertEquals(5, user_2.shoppingCart.items.size)
        Assert.assertEquals(14.6, user_2.shoppingCart.calculateTotal(), 0.0)
        Assert.assertTrue(user_2.shoppingCart.items.contains(tShirtIn))
        Assert.assertTrue(user_2.shoppingCart.items.contains(tShirtOut))
    }
}
