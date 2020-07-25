package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Animal
import kotlin.properties.Delegates

class Tiger(
    val aHungerLevel: Int
) : Animal {
    override var hungerLevel by Delegates.vetoable(
        aHungerLevel,
        {
            _, _, new ->
            new >= 0 && new <= 10
        }
    )

    override fun feed(food: Food): String {
        val isMeat = Food.Meat.equals(food)
        return if (isMeat) {
            this.hungerLevel -= food.nutritionalValue
            "Rarrr $food I eat, num num!"
        } else
            "Tiger no eat $food, rarr!"
    }
}
