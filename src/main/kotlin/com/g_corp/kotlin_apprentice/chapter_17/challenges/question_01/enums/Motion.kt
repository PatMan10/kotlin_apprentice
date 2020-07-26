package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Action

enum class Motion(
    override val energyCost: Int
) : Action {
    Swim(2),
    Walk(1),
    Run(3),
    Fly(3),
    Land(0),
}
