package com.g_corp.kotlin_apprentice.chapter_15.challenges.question_03.models

import kotlin.text.StringBuilder

data class FullName(
    var first: String,
    var middle: String?,
    var last: String
)

open class Person(val name: FullName, var age: Int) {
    val introduction: String
        get() {
            val stringBuilder = StringBuilder()
            val (first, middle, last) = this.name
            stringBuilder
                .append("Hi, my name is $first")
                .append(
                    if (middle != null)
                        " " + middle
                    else ""
                ).append(" $last, I'm $age years young! ;)")
            return stringBuilder.toString()
        }
}
