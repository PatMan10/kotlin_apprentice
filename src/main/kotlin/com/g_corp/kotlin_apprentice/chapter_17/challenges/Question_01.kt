package com.g_corp.kotlin_apprentice.chapter_17.challenges
fun main(args: Array<String>) {
    println("Challenge Question")
}

enum class Food(val nutritionalValue: Int) {
    Meat(5),
    Fruit(3),
    Vegetable(3),
    Plant(2),
    Seed(1),
    Worm(1)
}

interface Animal {
    var hungerLevel: Int

    fun feed(food: Food): String
}

interface Airborne {
    var isCaged: Boolean

    fun fly(): String
    fun land(): String
}

interface Aquatic {
    var inTank: Boolean

    fun swim(): String
}

interface Land {
    fun walk(): String
    fun run(): String
}

interface Pet {
    fun exercise(): String
    var name: String
}

class Tiger(override var hungerLevel: Int) : Animal {
    override fun feed(food: Food): String {
        val isMeat = Food.Meat.equals(food)
        return if (isMeat) {
            this.hungerLevel -= food.nutritionalValue
            "Rarrr $food I eat, num num!"
        } else
            "Tiger no eat $food, rarr!"
    }
}
