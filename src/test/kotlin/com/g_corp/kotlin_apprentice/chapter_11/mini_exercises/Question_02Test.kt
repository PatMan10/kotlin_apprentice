package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.Person
import org.junit.Assert
import org.junit.Test
import java.util.Random

public class Question_02Test {
    val random = Random()

    fun createListOfPeople(): MutableList<Person> {
        val people = mutableListOf<Person>()
        val a = random.nextInt(10)
        val b = random.nextInt(10) + 10

        for (i in a..b)
            people.add(Person(FullName("firstName_$i", "middleName_$i", "lastName_$i"), i * 10))

        return people
    }

    @Test
    fun testMemberOf() {
        val eliot = Person(FullName("Eliot", "mr. robot", "Alderson"), 32)
        val group_1 = createListOfPeople()
        val group_2 = createListOfPeople()
        val group_3 = createListOfPeople()
        val index = random.nextInt(group_3.size)
        group_3.add(index, eliot)

        Assert.assertFalse(memberOf(eliot, group_1))
        Assert.assertFalse(memberOf(eliot, group_2))
        Assert.assertTrue(memberOf(eliot, group_3))
    }
}
