package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Motion
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Airborne
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Animal
import kotlin.properties.Delegates

class Hawk(
    val aHungerLevel: Int
) : Animal, Airborne {
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

    override fun fly(): String {
        val fly = Motion.Fly
        return if (this.hasEnoughEnergyTo(fly)) {
            this.hungerLevel += fly.energyCost
            "${this.name} ${fly.name}s."
        } else
            "${this.name} too hungry to ${fly.name}."
    }

    override fun land(): String {
        val land = Motion.Land
        return if (this.hasEnoughEnergyTo(land)) {
            this.hungerLevel += land.energyCost
            "${this.name} ${land.name}s."
        } else
            "${this.name} too hungry to ${land.name}."
    }
}
