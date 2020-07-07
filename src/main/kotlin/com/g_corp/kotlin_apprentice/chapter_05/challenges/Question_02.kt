package com.g_corp.kotlin_apprentice.chapter_05.challenges

fun main(args: Array<String>) {
    var aLotOfAs = ""
    while (aLotOfAs.length < 10)
        aLotOfAs += "a"
    println("aLotOfAs.length = ${aLotOfAs.length}")
}
