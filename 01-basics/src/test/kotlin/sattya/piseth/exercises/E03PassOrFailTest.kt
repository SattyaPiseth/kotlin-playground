package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class E03PassOrFailTest {

    @Test
    fun passOrFail_returnsFail_belowThreshold() {
        assertEquals("FAIL", passOrFail(49))
    }

    @Test
    fun passOrFail_returnsPass_atThreshold() {
        assertEquals("PASS", passOrFail(50))
    }

    @Test
    fun passOrFail_returnsFail_atLowerBoundary() {
        assertEquals("FAIL", passOrFail(0))
    }

    @Test
    fun passOrFail_returnsPass_atUpperBoundary() {
        assertEquals("PASS", passOrFail(100))
    }

    @Test
    fun passOrFail_rejectsNegativeScore() {
        assertFailsWith<IllegalArgumentException> {
            passOrFail(-1)
        }
    }

    @Test
    fun passOrFail_rejectsScoreAboveHundred() {
        assertFailsWith<IllegalArgumentException> {
            passOrFail(101)
        }
    }
}
