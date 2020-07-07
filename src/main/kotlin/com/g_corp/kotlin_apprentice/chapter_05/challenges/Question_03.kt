package com.g_corp.kotlin_apprentice.chapter_05.challenges

fun main(args: Array<String>) {
    func(Triple(1, 5, 0))
    func(Triple(2, 2, 2))
    func(Triple(3, 0, 1))
    func(Triple(3, 2, 5))
    func(Triple(0, 2, 4))
}

fun func(point3D: Triple<Int, Int, Int>) {
    val (x, y, z) = point3D
    when {
        x.equals(y) && y.equals(z) -> println("($x, $y, $z) x = y = z")
        x.equals(0) -> println("($x, $y, $z) On the y/z plane.")
        y.equals(0) -> println("($x, $y, $z) On the x/z plane.")
        z.equals(0) -> println("($x, $y, $z) On the x/y plane.")
        else -> println("($x, $y, $z) Nothing special.")
    }
}
