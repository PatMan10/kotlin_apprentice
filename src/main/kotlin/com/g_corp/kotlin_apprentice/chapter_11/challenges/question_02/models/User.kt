package com.g_corp.kotlin_apprentice.chapter_11.challenges.question_02.models

class User(
    val address: Address,
    val contactInfo: ContactInfo,
    val name: FullName,
    val shoppingCart: ShoppingCart = ShoppingCart()
)
