package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class E01MaxOfTwoTest {

    @Test
    fun maxOfTwo_returnsFirst_whenFirstIsGreater() {
        assertEquals(10, maxOfTwo(10, 3))
    }

    @Test
    fun maxOfTwo_returnsSecond_whenSecondIsGreater() {
        assertEquals(8, maxOfTwo(2, 8))
    }

    @Test
    fun maxOfTwo_returnsValue_whenBothAreEqual() {
        assertEquals(7, maxOfTwo(7, 7))
    }

    @Test
    fun maxOfTwo_handlesNegativeValues() {
        assertEquals(-1, maxOfTwo(-5, -1))
    }

    @Test
    fun maxOfTwo_handlesMinValueAgainstZero() {
        assertEquals(0, maxOfTwo(Int.MIN_VALUE, 0))
    }

    @Test
    fun maxOfTwo_handlesMaxValueAgainstMinValue() {
        assertEquals(Int.MAX_VALUE, maxOfTwo(Int.MAX_VALUE, Int.MIN_VALUE))
    }
}
