package com.g_corp.kotlin_apprentice.chapter_11.mini_exercises.models

class Student(
    val name: FullName,
    val grades: MutableList<Grade> = mutableListOf()
) {
    fun recordGrade(grade: Grade) = this.grades.add(grade)

    fun calculateGPA(): Double {
        var creditsSum = 0.0
        var pointsSum = 0.0

        for (grade in this.grades) {
            creditsSum += grade.credits
            pointsSum += grade.points
        }

        var average = pointsSum / creditsSum
        average = Math.round(average * 100) / 100.0
        return average
    }
}
