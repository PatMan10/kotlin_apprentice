package com.g_corp.kotlin_apprentice.chapter_16.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

fun canAfford(cost: Double, wallet: List<AcceptedCurrency>): Boolean {
    var totalInDolars = 0.0
    for (currency in wallet) {
        totalInDolars += currency.convertToDollars
        if (totalInDolars >= cost)
            return true
    }
    return totalInDolars >= cost
}
