package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food

interface Animal {
    var hungerLevel: Int
    val name: String

    fun feed(food: Food): String

    fun hasEnoughEnergyTo(action: Action): Boolean =
        this.hungerLevel + action.energyCost <= 10
}
