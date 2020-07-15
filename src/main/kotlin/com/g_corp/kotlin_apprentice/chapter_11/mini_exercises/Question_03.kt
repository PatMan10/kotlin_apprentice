package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.Grade
import com.g_corp.kotlin_apprentice.chapter_11.models.Student

fun main(args: Array<String>) {
    val student = Student(FullName("Patrick", "Jr.", "Heynes"))
    student.recordGrade(Grade("B", 9.0, 3.0))
    student.recordGrade(Grade("A", 16.0, 4.0))
    println("${student.name}'s GPA is ${student.calculateGPA()}.")
}
