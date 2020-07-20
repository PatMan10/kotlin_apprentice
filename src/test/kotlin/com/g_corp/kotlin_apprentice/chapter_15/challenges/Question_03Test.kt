package com.g_corp.kotlin_apprentice.chapter_15.challenges

import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.FullName
import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.Grade
import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.GradeSymbol
import com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models.StudentSoccerPlayer
import org.junit.Assert
import org.junit.Test

public class Question_03Test {
    @Test
    fun testStudentSoccerPlayer() {
        val messi = StudentSoccerPlayer(
            FullName("Lionel", "Andres", "Messi"), 33, "Centre Forward", 10, 485, 444
        )
        messi.recordGrade(Grade(GradeSymbol.A, 2.0, 3.0))
        messi.recordGrade(Grade(GradeSymbol.B, 3.0, 2.0))
        messi.recordGrade(Grade(GradeSymbol.C, 1.0, 4.0))
        Assert.assertTrue(messi.isEligible)
        Assert.assertTrue(messi.goalAverage > 0.9)

        val zol = StudentSoccerPlayer(
            FullName("Zol", "Neus", "Bees"), 19, "Striker", 9, 10, 5
        )
        zol.recordGrade(Grade(GradeSymbol.D, 1.0, 6.0))
        zol.recordGrade(Grade(GradeSymbol.E, 1.0, 4.0))
        zol.recordGrade(Grade(GradeSymbol.F, 1.0, 8.0))
        zol.recordGrade(Grade(GradeSymbol.F, 1.0, 8.0))
        zol.recordGrade(Grade(GradeSymbol.F, 1.0, 8.0))
        Assert.assertTrue(zol.failedClasses.size >= 3)
        Assert.assertFalse(zol.isEligible)
        Assert.assertTrue(zol.goalAverage < 0.9)
    }
}
