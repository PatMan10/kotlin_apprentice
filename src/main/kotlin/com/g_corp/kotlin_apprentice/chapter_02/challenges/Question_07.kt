package com.g_corp.kotlin_apprentice.chapter_02.challenges

fun main(args: Array<String>) {
    val position: Int = 63
    val maxRows: Int = 8
    val maxCols: Int = 8
    var row = position / maxRows
    var col = position % maxCols
    println("row = $row col = $col")
}
