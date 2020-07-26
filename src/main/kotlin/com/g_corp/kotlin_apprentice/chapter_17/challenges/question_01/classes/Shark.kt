package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Motion
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Animal
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Aquatic
import kotlin.properties.Delegates

class Shark(
    val aHungerLevel: Int
) : Animal, Aquatic {
    override val name: String = this.javaClass.simpleName
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
            "${this.name} eats $food."
        } else
            "${this.name} no eat $food."
    }

    override fun swim(): String {
        val swim = Motion.Swim
        return if (this.hasEnoughEnergyTo(swim)) {
            this.hungerLevel += swim.energyCost
            "${this.name} ${swim.name}s."
        } else
            "${this.name} too hungry to ${swim.name}."
    }
}
