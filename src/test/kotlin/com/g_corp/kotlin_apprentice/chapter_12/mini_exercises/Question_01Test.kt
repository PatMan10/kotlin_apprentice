package com.g_corp.kotlin_apprentice.chapter_12.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_12.mini_exercises.question_01.models.FullName
import com.g_corp.kotlin_apprentice.chapter_12.mini_exercises.question_01.models.Student
import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    @Test
    fun testSomething() {
        val students = mutableListOf(
            Student(0, FullName("Jack", "Patrick", "Dorsey")),
            Student(1, FullName("Sarah", "", "Fisher")),
            Student(2, FullName("Sam", "", "Fisher"))
        )
        Assert.assertEquals(3, Student.Companion.getNumberOfStudents())
    }
}
