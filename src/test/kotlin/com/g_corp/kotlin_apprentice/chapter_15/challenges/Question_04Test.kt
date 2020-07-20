package com.g_corp.kotlin_apprentice.chapter_15.challenges

import org.junit.Assert
import org.junit.Test

public class Question_04Test {
    @Test
    fun testSealedClasses() {
        val loading = Resource.Loading()
        val success = Resource.Success("Operation successfull. :)")
        val error = Resource.Error("Operation failed. :(")
        Assert.assertTrue(loading is Resource.Loading)
        Assert.assertTrue(success is Resource.Success)
        Assert.assertTrue(error is Resource.Error)
        Assert.assertEquals("Operation successfull. :)", success.message)
        Assert.assertEquals("Operation failed. :(", error.message)
    }
}
