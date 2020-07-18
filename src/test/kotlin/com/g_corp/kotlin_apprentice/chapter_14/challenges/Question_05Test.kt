package com.g_corp.kotlin_apprentice.chapter_14.challenges

import org.junit.Assert
import org.junit.Test

public class Question_05Test {
    @Test
    fun testExtensionMethodPrimeFactors() {
        fun Int.primeFactors(): List<Int> {
            var remainingValue = this
            var testFactor = 2
            val primes = mutableListOf<Int>()

            while (testFactor * testFactor <= remainingValue)
                if (remainingValue % testFactor == 0) {
                    primes.add(testFactor)
                    remainingValue /= testFactor
                } else
                    testFactor += 1

            if (remainingValue > 1)
                primes.add(remainingValue)

            return primes
        }

        Assert.assertEquals(listOf(3, 3, 3, 3), 81.primeFactors())
    }
}
