package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class E03NumericConversionsTest {

    @Test
    fun addIntAndLong_addsPositiveValues() {
        assertEquals(30L, addIntAndLong(10, 20L))
    }

    @Test
    fun addIntAndLong_handlesNegativeValues() {
        assertEquals(-15L, addIntAndLong(-5, -10L))
    }

    @Test
    fun addIntAndLong_handlesZero() {
        assertEquals(7L, addIntAndLong(0, 7L))
    }

    @Test
    fun numericTypeName_identifiesInt() {
        assertEquals("Int", numericTypeName(1))
    }

    @Test
    fun numericTypeName_identifiesLong() {
        assertEquals("Long", numericTypeName(1L))
    }

    @Test
    fun numericTypeName_identifiesDouble() {
        assertEquals("Double", numericTypeName(1.0))
    }
}
