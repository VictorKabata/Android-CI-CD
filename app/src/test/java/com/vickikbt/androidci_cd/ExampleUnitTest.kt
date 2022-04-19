package com.vickikbt.androidci_cd

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host/runner).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val operation = 2 + 2
        val result = 4

        assertEquals(result, operation)
    }

    @Test
    fun subtraction_isCorrect() {
        val operation = 4 - 2
        val result = 2

        assertEquals(result, operation)
    }
}
