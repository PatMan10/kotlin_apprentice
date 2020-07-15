package com.g_corp.kotlin_apprentice.chapter_11.models

class User(
    val name: FullName,
    val movieLists: MutableMap<String, MovieList> = mutableMapOf()
) {
    fun addMovieList(list: MovieList) =
        this.movieLists.put(list.name, list)

    fun getMovieList(listName: String): MovieList? =
        this.movieLists.get(listName)
}
