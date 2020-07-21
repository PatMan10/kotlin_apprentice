package com.g_corp.kotlin_apprentice.chapter_16.challenges

import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testRound() {
        Assert.assertEquals(2.25, round(2.2521212), 0.0)
        Assert.assertEquals(1.04, round(1.0421212), 0.0)
        Assert.assertEquals(992.01, round(992.0121212), 0.0)
    }

    @Test
    fun testAcceptedCurrency() {
        val dolar = AcceptedCurrency.Dollar(10.0)
        val euro = AcceptedCurrency.Euro(5.0)
        val crypto = AcceptedCurrency.Crypto(2.0)

        Assert.assertEquals(1.0, dolar.unitValueInDollars, 0.0)
        Assert.assertEquals(1.25, euro.unitValueInDollars, 0.0)
        Assert.assertEquals(2534.92, crypto.unitValueInDollars, 0.0)

        Assert.assertEquals(10.0, dolar.convertToDollars, 0.0)
        Assert.assertEquals(6.25, euro.convertToDollars, 0.0)
        Assert.assertEquals(5069.84, crypto.convertToDollars, 0.0)

        Assert.assertEquals(16.25, dolar.sum(euro), 0.0)
        Assert.assertEquals(5076.09, euro.sum(crypto), 0.0)
        Assert.assertEquals(5079.84, crypto.sum(dolar), 0.0)
    }
}
