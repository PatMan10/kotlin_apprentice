package com.g_corp.kotlin_apprentice.chapter_11.challenges.question_02.models

class ShoppingCart(
    val items: MutableList<TShirt> = mutableListOf()
) {
    fun addItem(item: TShirt): Boolean =
        this.items.add(item)

    fun removeItem(item: TShirt): Boolean =
        this.items.remove(item)

    fun calculateTotal(): Double {
        var total = 0.0
        this.items.forEach({ total += it.price })
        return Math.round(total * 100) / 100.0
    }
}
