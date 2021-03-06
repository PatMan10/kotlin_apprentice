package com.g_corp.kotlin_apprentice.chapter_12.challenges.question_02.models

import com.g_corp.kotlin_apprentice.chapter_12.challenges.question_02.utils.JsonKey

class Student private constructor(
    val id: Int,
    val name: FullName
) {
    companion object {
        private var studentCount = 0

        fun newStudent(name: FullName) = Student(++studentCount, name)

        fun getNumberOfStudents() = studentCount

        fun loadStudent(studentMap: Map<String, String>) =
            newStudent(
                FullName(
                    studentMap.getOrDefault(JsonKey.FIRST_NAME, "First"),
                    studentMap.getOrDefault(JsonKey.MIDDLE_NAME, "Middle"),
                    studentMap.getOrDefault(JsonKey.LAST_NAME, "Last")
                )
            )
    }
}
