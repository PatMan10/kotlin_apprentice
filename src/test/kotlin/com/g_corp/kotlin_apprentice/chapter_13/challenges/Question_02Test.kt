package com.g_corp.kotlin_apprentice.chapter_13.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testCarClass() {
        val car_1 = Car("Blue", "Lamborghini")

        Assert.assertEquals(10.0, car_1.fuelTankCapacity, 0.0)

        car_1.drive(2.0)
        Assert.assertEquals(9.0, car_1.fuelTankLevel, 0.0)
        Assert.assertFalse(car_1.fuelTankIsLow)
        car_1.drive(3.0)
        Assert.assertEquals(7.5, car_1.fuelTankLevel, 0.0)
        Assert.assertFalse(car_1.fuelTankIsLow)
        car_1.drive(14.0)
        Assert.assertEquals(0.5, car_1.fuelTankLevel, 0.0)
        Assert.assertTrue(car_1.fuelTankIsLow)
        car_1.refill(2.0)
        Assert.assertEquals(2.5, car_1.fuelTankLevel, 0.0)
        Assert.assertFalse(car_1.fuelTankIsLow)
        car_1.drive(5.0)
        Assert.assertEquals(0.0, car_1.fuelTankLevel, 0.0)
        Assert.assertTrue(car_1.fuelTankIsLow)
        car_1.refill(100.0)
        Assert.assertEquals(10.0, car_1.fuelTankLevel, 0.0)
        Assert.assertFalse(car_1.fuelTankIsLow)
    }
}
