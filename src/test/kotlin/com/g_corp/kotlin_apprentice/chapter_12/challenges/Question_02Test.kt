package com.g_corp.kotlin_apprentice.chapter_12.challenges

import com.g_corp.kotlin_apprentice.chapter_12.challenges.question_02.models.FullName
import com.g_corp.kotlin_apprentice.chapter_12.challenges.question_02.models.Student
import org.junit.Assert
import org.junit.Test
import com.g_corp.kotlin_apprentice.chapter_12.challenges.question_02.utils.Constant as C

public class Question_02Test {
    @Test
    fun testNewStudent() {
        val student_1 = Student.newStudent(FullName("Student_1", "", ""))
        val student_2 = Student.newStudent(FullName("Student_2", "", ""))
        val student_3 = Student.newStudent(FullName("Student_3", "", ""))
        val student_4 = Student.newStudent(FullName("Student_4", "", ""))
        Assert.assertEquals(4, Student.getNumberOfStudents())
        Assert.assertEquals(1, student_1.id)
        Assert.assertEquals(2, student_2.id)
        Assert.assertEquals(3, student_3.id)
        Assert.assertEquals(4, student_4.id)
    }

    @Test
    fun testLoadStudent() {
        val studentMap_1 = mapOf<String, String>()
        val student_1 = Student.loadStudent(studentMap_1)
        Assert.assertEquals("First", student_1.name.first)
        Assert.assertEquals("Middle", student_1.name.middle)
        Assert.assertEquals("Last", student_1.name.last)

        val studentMap_2 = mapOf(
            C.JsonKey.FIRST_NAME to "Patrick",
            C.JsonKey.MIDDLE_NAME to "Jr.",
            C.JsonKey.LAST_NAME to "Heynes"
        )
        val student_2 = Student.loadStudent(studentMap_2)
        Assert.assertEquals("Patrick", student_2.name.first)
        Assert.assertEquals("Jr.", student_2.name.middle)
        Assert.assertEquals("Heynes", student_2.name.last)
    }
}
