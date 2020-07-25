package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food

interface Animal {
    var hungerLevel: Int

    fun feed(food: Food): String
}
