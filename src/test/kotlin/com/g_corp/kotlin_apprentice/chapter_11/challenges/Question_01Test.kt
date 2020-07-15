package com.g_corp.kotlin_apprentice.chapter_11.challenges

import com.g_corp.kotlin_apprentice.chapter_11.models.FullName
import com.g_corp.kotlin_apprentice.chapter_11.models.MovieList
import com.g_corp.kotlin_apprentice.chapter_11.models.User
import org.junit.Assert
import org.junit.Test

public class Question_01Test {
    var userCount = 0
    var movieCount = 0
    var movieListCount = 0
    val name: FullName = FullName("zol", "zlo", "dlo")

    fun createUser() =
        User(
            FullName(
                "firstName_$userCount",
                "middleName_$userCount",
                "lastName_${userCount++}"
            )
        )

    fun createMovieList(): MovieList {
        val movieList = MovieList("movieList_${movieListCount++}")
        for (i in 0..2)
            movieList.addMovie("movie_${movieCount++}")
        return movieList
    }

    @Test
    fun testReferenceTypes() {
        val user_0 = createUser()
        val user_1 = createUser()
        val movieList_0 = createMovieList()
        val movieList_1 = createMovieList()

        user_0.addMovieList(movieList_0)
        user_0.addMovieList(movieList_1)
        user_1.addMovieList(movieList_0)
        user_1.addMovieList(movieList_1)

        user_0.getMovieList("movieList_0")!!.addMovie("Spider-Man 3")
        user_0.getMovieList("movieList_1")!!.addMovie("The Dark Knight")

        Assert.assertEquals(user_0.getMovieList("movieList_0")!!.movieTitles.size, user_1.getMovieList("movieList_0")!!.movieTitles.size)
        Assert.assertTrue(user_1.getMovieList("movieList_0")!!.movieTitles.contains("Spider-Man 3"))
        Assert.assertTrue(user_1.getMovieList("movieList_1")!!.movieTitles.contains("The Dark Knight"))

        user_1.getMovieList("movieList_0")!!.addMovie("300")
        user_1.getMovieList("movieList_1")!!.addMovie("Bad Boys 3")

        Assert.assertEquals(user_1.getMovieList("movieList_0")!!.movieTitles.size, user_0.getMovieList("movieList_0")!!.movieTitles.size)
        Assert.assertTrue(user_0.getMovieList("movieList_0")!!.movieTitles.contains("300"))
        Assert.assertTrue(user_0.getMovieList("movieList_1")!!.movieTitles.contains("Bad Boys 3"))
    }

    @Test
    fun testSomething() {
        Assert.assertEquals(1, 1)
    }
}
