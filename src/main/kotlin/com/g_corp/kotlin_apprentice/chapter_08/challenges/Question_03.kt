package com.g_corp.kotlin_apprentice.chapter_08.challenges

fun main(args: Array<String>) {
    println("Chalenge Question")
}

fun remove(itemToRemove: Int, list: List<Int>): List<Int> {
    var cloneList: MutableList<Int> = ArrayList<Int>()

    for (item in list)
        if (!itemToRemove.equals(item))
            cloneList.add(item)
    return cloneList
}
