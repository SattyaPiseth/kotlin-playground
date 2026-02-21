package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class E02ClassifySignTest {

    @Test
    fun classifySign_returnsNegative_forTypicalNegative() {
        assertEquals("NEGATIVE", classifySign(-5))
    }

    @Test
    fun classifySign_returnsZero_forZero() {
        assertEquals("ZERO", classifySign(0))
    }

    @Test
    fun classifySign_returnsPositive_forTypicalPositive() {
        assertEquals("POSITIVE", classifySign(7))
    }

    @Test
    fun classifySign_returnsNegative_forIntMinValue() {
        assertEquals("NEGATIVE", classifySign(Int.MIN_VALUE))
    }

    @Test
    fun classifySign_returnsPositive_forIntMaxValue() {
        assertEquals("POSITIVE", classifySign(Int.MAX_VALUE))
    }

    @Test
    fun classifySign_returnsNegative_forMinusOne() {
        assertEquals("NEGATIVE", classifySign(-1))
    }
}
