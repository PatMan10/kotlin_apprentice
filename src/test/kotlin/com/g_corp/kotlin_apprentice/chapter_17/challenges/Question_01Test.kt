package com.g_corp.kotlin_apprentice.chapter_17.challenges

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes.Hawk
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes.Shark
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes.Tiger
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food
import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testTiger() {
        val tiger = Tiger(5)
        Assert.assertEquals("Tiger eats Meat.", tiger.feed(Food.Meat))
        Assert.assertEquals(0, tiger.hungerLevel)

        Assert.assertEquals("Tiger Walks.", tiger.walk())
        Assert.assertEquals(1, tiger.hungerLevel)

        Assert.assertEquals("Tiger Runs.", tiger.run())
        Assert.assertEquals(4, tiger.hungerLevel)

        Assert.assertEquals("Tiger Runs.", tiger.run())
        Assert.assertEquals(7, tiger.hungerLevel)

        Assert.assertEquals("Tiger Runs.", tiger.run())
        Assert.assertEquals(10, tiger.hungerLevel)

        Assert.assertEquals("Tiger too hungry to Run.", tiger.run())
        Assert.assertEquals(10, tiger.hungerLevel)

        Assert.assertEquals("Tiger eats Meat.", tiger.feed(Food.Meat))
        Assert.assertEquals(5, tiger.hungerLevel)
    }

    @Test
    fun testHawk() {
        val hawk = Hawk(5)
        Assert.assertEquals("Hawk eats Meat.", hawk.feed(Food.Meat))
        Assert.assertEquals(0, hawk.hungerLevel)

        Assert.assertEquals("Hawk Flys.", hawk.fly())
        Assert.assertEquals(3, hawk.hungerLevel)

        Assert.assertEquals("Hawk Flys.", hawk.fly())
        Assert.assertEquals(6, hawk.hungerLevel)

        Assert.assertEquals("Hawk Flys.", hawk.fly())
        Assert.assertEquals(9, hawk.hungerLevel)

        Assert.assertEquals("Hawk too hungry to Fly.", hawk.fly())
        Assert.assertEquals(9, hawk.hungerLevel)

        Assert.assertEquals("Hawk Lands.", hawk.land())
        Assert.assertEquals(9, hawk.hungerLevel)
    }

    @Test
    fun testShark() {
        val shark = Shark(10)
        Assert.assertEquals("Shark eats Meat.", shark.feed(Food.Meat))
        Assert.assertEquals(5, shark.hungerLevel)

        Assert.assertEquals("Shark Swims.", shark.swim())
        Assert.assertEquals(7, shark.hungerLevel)

        Assert.assertEquals("Shark Swims.", shark.swim())
        Assert.assertEquals(9, shark.hungerLevel)

        Assert.assertEquals("Shark too hungry to Swim.", shark.swim())
        Assert.assertEquals(9, shark.hungerLevel)

        Assert.assertEquals("Shark eats Meat.", shark.feed(Food.Meat))
        Assert.assertEquals(4, shark.hungerLevel)
    }
}
