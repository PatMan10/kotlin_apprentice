package com.g_corp.kotlin_apprentice.chapter_09.challenges

import org.junit.Assert
import org.junit.Test

public class Question_02Test {
    @Test
    fun testFilterValuesLongerThan() {
        val provinces = mapOf("NC" to "Northen Cape", "WC" to "Western Cape", "LP" to "Limpopo", "MP" to "Mpumalanga")
        Assert.assertEquals(mapOf("NC" to "Northen Cape", "WC" to "Western Cape", "MP" to "Mpumalanga").toString(), filterValuesLongerThan(9, provinces).toString())
        Assert.assertEquals(mapOf("NC" to "Northen Cape", "WC" to "Western Cape").toString(), filterValuesLongerThan(10, provinces).toString())
        Assert.assertEquals(mapOf<String, String>().toString(), filterValuesLongerThan(12, provinces).toString())
    }
}
