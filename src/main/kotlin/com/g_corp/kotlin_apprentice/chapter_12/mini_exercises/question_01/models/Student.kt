package com.g_corp.kotlin_apprentice.chapter_12.mini_exercises.question_01.models

class Student(
    val id: Int,
    val name: FullName
) {
    companion object {
        private var studentCount = 0

        fun getNumberOfStudents() = studentCount
    }

    init {
        studentCount++
    }
}
