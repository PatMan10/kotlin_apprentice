package com.g_corp.kotlin_apprentice.chapter_16.challenges

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testCanAfford() {
        val wallet_1 = listOf(
            AcceptedCurrency.Dollar(10.0),
            AcceptedCurrency.Euro(1.0)
        )
        val wallet_2 = listOf(
            AcceptedCurrency.Dollar(2.0)
        )
        val wallet_3 = listOf(
            AcceptedCurrency.Dollar(100.0),
            AcceptedCurrency.Euro(69.0),
            AcceptedCurrency.Crypto(1.0)
        )

        Assert.assertTrue(canAfford(11.25, wallet_1))
        Assert.assertFalse(canAfford(2.0000001, wallet_2))
        Assert.assertFalse(canAfford(Double.MAX_VALUE, wallet_3))
    }
}
