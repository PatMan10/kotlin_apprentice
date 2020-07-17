package com.g_corp.kotlin_apprentice.chapter_13.challenges

import kotlin.properties.Delegates

fun main(args: Array<String>) {
    println("Challenge Question")
}

class FuelTank(val capacity: Double) {

    var isLow: Boolean = false
    var level: Double by Delegates.observable(this.capacity) {
        _, _, new ->
        val lowerThan10Percent = new < this.capacity * 0.1
        if (lowerThan10Percent)
            isLow = true
        else isLow = false
    }

    fun reduce(kmDriven: Double) {
        this.level -= kmDriven / 2.0
    }

    fun refill(litres: Double) {
        this.level =
            if (litres < capacity)
                this.level + litres
            else capacity
    }
}

class Car(
    val color: String,
    val make: String,
    val fuelTankCapacity: Double = 10.0
) {
    private val fuelTank: FuelTank = FuelTank(fuelTankCapacity)
    var fuelTankLevel: Double = this.fuelTank.level
    var fuelTankIsLow: Boolean = this.fuelTank.isLow

    fun resetLocalFuelTankProperties() {
        this.fuelTankLevel = this.fuelTank.level
        this.fuelTankIsLow = this.fuelTank.isLow
    }

    fun drive(kmDriven: Double) {
        this.fuelTank.reduce(kmDriven)
        this.resetLocalFuelTankProperties()
    }

    fun refill(litres: Double) {
        this.fuelTank.refill(litres)
        this.resetLocalFuelTankProperties()
    }
}
