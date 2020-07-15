package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_11.mini_exercises.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.mini_exercises.models.Grade
import com.g_corp.kotlin_apprentice.chapter_11.mini_exercises.models.Student
import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testCalculateGPA() {
        val student_1 = Student(FullName("Patrick", "Jr.", "Heynes"))
        student_1.recordGrade(Grade("B", 9.0, 3.0))
        student_1.recordGrade(Grade("A", 16.0, 4.0))

        val student_2 = Student(FullName("Eliot", "mr. robot", "Alderson"))
        student_2.recordGrade(Grade("A", 16.0, 4.0))
        student_2.recordGrade(Grade("A", 16.0, 4.0))

        Assert.assertEquals(3.57, student_1.calculateGPA(), 0.0)
        Assert.assertEquals(4.00, student_2.calculateGPA(), 0.0)
    }
}
