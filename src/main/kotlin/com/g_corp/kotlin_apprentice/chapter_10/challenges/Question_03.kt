package com.g_corp.kotlin_apprentice.chapter_10.challenges

fun main(args: Array<String>) {
    println("Question")
}

fun calculateAverages(appNameAndRatings: Map<String, Array<Int>>): Map<String, Double> {
    val averageRatings = HashMap<String, Double>()
    var average: Double
    var sum: Int
    appNameAndRatings.forEach({ key, array ->
        sum = array.reduce({ a, b -> a + b })
        average = sum.toDouble() / array.size
        averageRatings.put(key, average)
    })

    return averageRatings
}

fun filterRatingGreaterThan(number: Int, appNamesAndAverageRatings: Map<String, Double>): List<String> {
    return appNamesAndAverageRatings.filter({ (key, value) -> value > number }).map({ (key, _) -> key })
}
