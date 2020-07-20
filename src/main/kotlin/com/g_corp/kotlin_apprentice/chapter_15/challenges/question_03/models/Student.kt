package com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models

enum class GradeSymbol {
    A, B, C, D, E, F
}

data class Grade(
    val letter: GradeSymbol,
    val points: Double,
    val credits: Double
)

open class Student(name: FullName, age: Int) : Person(name, age) {

    var grades: MutableList<Grade> = mutableListOf()

    constructor(
        name: FullName,
        age: Int,
        grades: MutableList<Grade>
    ) : this(name, age) {
        this.grades = grades
    }

    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

open class StudentAthlete(name: FullName, age: Int) : Student(name, age) {
    val failedClasses: MutableList<Grade> = mutableListOf()

    val isEligible: Boolean
        get() = failedClasses.size < 3

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)

        if (grade.letter.equals(GradeSymbol.F))
            failedClasses.add(grade)
    }
}

class StudentSoccerPlayer(
    name: FullName,
    age: Int,
    var postion: String,
    var number: Int,
    var gamesCount: Int,
    var goalsCount: Int
) : StudentAthlete(name, age) {
    val goalAverage: Double
        get() {
            val average: Double = goalsCount / gamesCount.toDouble()
            return Math.round(average * 100) / 100.0
        }
}
