package com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.checking_for_null

import com.g_corp.kotlin_apprentice.chapter_07.mini_exercises.nullable_types.getSong

fun main(args: Array<String>) {
    for (i in 0..10)
        println(getSongMessage(i))
}

fun getSongMessage(number: Int): String {
    val song = getSong(number)
    val nullableSong: String?
    val nonNullableSong: String

    if (song != null) {
        nonNullableSong = song
        return "Song at index $number is \"$nonNullableSong\"."
    } else {
        nullableSong = song
        return "No song at index $number, got $nullableSong instead."
    }
}
