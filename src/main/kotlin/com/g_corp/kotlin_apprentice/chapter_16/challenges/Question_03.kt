package com.g_corp.kotlin_apprentice.chapter_16.challenges

fun main(args: Array<String>) {
    println("Challenge Question")
}

fun round(valueToRound: Double): Double {
    return Math.round(valueToRound * 100) / 100.0
}

enum class CurrencyName {
    Dollar,
    Euro,
    Crypto,
}

sealed class AcceptedCurrency(var amount: Double = 0.0) {
    val name: CurrencyName
        get() = when (this) {
            is Dollar -> CurrencyName.Dollar
            is Euro -> CurrencyName.Euro
            is Crypto -> CurrencyName.Crypto
        }

    val unitValueInDollars: Double
        get() = when (this) {
            is Dollar -> 1.0
            is Euro -> 1.25
            is Crypto -> 2534.92
        }

    val convertToDollars: Double
        get() = round(this.amount * this.unitValueInDollars)

    fun sum(currency: AcceptedCurrency): Double {
        return if (this.name.equals(currency.name))
            round(this.amount + currency.amount)
        else
            round(this.convertToDollars + currency.convertToDollars)
    }

    class Dollar(amount: Double) : AcceptedCurrency(amount)
    class Euro(amount: Double) : AcceptedCurrency(amount)
    class Crypto(amount: Double) : AcceptedCurrency(amount)
}
