package com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.classes

import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Food
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.enums.Motion
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Animal
import com.g_corp.kotlin_apprentice.chapter_17.challenges.question_01.interfaces.Land
import kotlin.properties.Delegates

class Tiger(
    val aHungerLevel: Int
) : Animal, Land {
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

    override fun walk(): String {
        val walk = Motion.Walk
        return if (this.hasEnoughEnergyTo(walk)) {
            this.hungerLevel += walk.energyCost
            "${this.name} ${walk.name}s."
        } else
            "${this.name} too hungry to ${walk.name}."
    }

    override fun run(): String {
        val run = Motion.Run
        return if (this.hasEnoughEnergyTo(run)) {
            this.hungerLevel += run.energyCost
            "${this.name} ${run.name}s."
        } else
            "${this.name} too hungry to ${run.name}."
    }
}
