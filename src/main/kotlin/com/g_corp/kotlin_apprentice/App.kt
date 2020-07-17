package com.g_corp.kotlin_apprentice

fun main(args: Array<String>) {
    val name = FullName("Patrick", "Jr.", "Heynes")
    val nameVerbose = FullName("Mike", "", "Epps")
    nameVerbose.first = "DIck"
    println(name)
    println(name.full)
    println(nameVerbose)
    println(nameVerbose.full)
}

data class FullName(var first: String, var middle: String, var last: String) {
    val full: String
        get() = "${this.first} ${this.middle} ${this.last}"
}

class FullNameVerbose {
    var first: String
        get() = this.first
        set(value) { this.first = value }

    var middle: String
        get() = this.middle
        set(value) { this.middle = value }

    var last: String
        get() = this.last
        set(value) { this.last = value }

    val full: String
        get() = "${this.first} ${this.middle} ${this.last}"
}
