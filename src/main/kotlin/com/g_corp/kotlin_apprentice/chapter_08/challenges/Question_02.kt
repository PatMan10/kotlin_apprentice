package com.g_corp.kotlin_apprentice.chapter_08.challenges

fun main(args: Array<String>) {
    println("Chalenge Question")
}

fun removeOne(itemToRemove: Int, list: List<Int>): List<Int> {
    var gotItem = false
    var cloneList: MutableList<Int> = ArrayList<Int>()

    for (item in list)
        if (!gotItem && itemToRemove.equals(item))
            gotItem = true
        else
            cloneList.add(item)
    return cloneList
}
