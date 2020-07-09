package com.g_corp.kotlin_apprentice.chapter_09.challenges

fun main(args: Array<String>) {
    println("val map1: Map<Int to Int> = emptyMap() -> invalid, because \"to\" cant be used to split genric types")
    println("val map2 = emptyMap() -> invalid, because there is not enough info to infer the type of the map's elements")
    println("val map3: Map<Int, Int> = emptyMap () -> valid")
    println()

    println("val map4 = mapOf(\"One\" to 1, \"Two\" to 2, \"Three\" to 3)")
    println("map4[1] -> invalid, because the map's keys type is infered as String not Int")
    println("map4[\"One\"] -> valid")
    println("map4[\"Zero\"] = 0 -> invalid, because map is immutable")
    println("map4[0] = \"Zero\" -> invalid, because the map's keys type is infered as String not Int, and map is immutable")
    println()

    println("val map5 = mutableMapOf(\"NY\" to \"New York\", \"CA\" to \"California\"")
    println("map5[\"NY\"] -> valid")
    println("map5[\"WA\"] = Washington -> valid")
    println("map5[\"CA\"] = null -> invalid, because map's values type is infered to be nonNullable types")
}
