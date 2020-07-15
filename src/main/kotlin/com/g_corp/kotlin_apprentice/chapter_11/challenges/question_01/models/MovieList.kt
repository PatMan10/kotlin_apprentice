package com.g_corp.kotlin_apprentice.chapter_11.challenges.question_01.models

class MovieList(
    val name: String,
    val movieTitles: MutableList<String> = mutableListOf()
) {
    fun addMovie(movieName: String) = this.movieTitles.add(movieName)

    fun printMovies() {
        for (title in this.movieTitles)
            println("$title")
    }
}
