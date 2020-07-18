package com.g_corp.kotlin_apprentice.chapter_15.challenges

fun main(args: Array<String>) {
    val c: C = C()
    println("${c.name} done!")
}

open class A {
    open val name: String
        get() = "AAA"

    open val superName: String
        get() = "N/A"
}

open class B : A() {
    init {
        println("SUPER ${super.name}")
        println("Hi I'm ${this.name}, my parent is ${super.name}")
    }

    override val name: String
        get() = "BBB"

    override val superName: String
        get() = super.name
}

open class C : B() {
    init {
        println("SUPER ${super.name}")
        println("Hi I'm ${this.name}, my parent is ${super.name}")
    }

    override val name: String
        get() = "CCC"

    override val superName: String
        get() = "N/A"
}

class D : C() {
    init {
        println("SUPER ${super.name}")
        println("Hi I'm ${this.name}, my parent is ${super.name}")
    }

    override val name: String
        get() = "DDD"

    override val superName: String
        get() = "N/A"
}
