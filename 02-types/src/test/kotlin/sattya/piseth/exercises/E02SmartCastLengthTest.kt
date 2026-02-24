package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class E02SmartCastLengthTest {

    @Test
    fun describeLengthCandidate_handlesString() {
        assertEquals("STRING(length=6)", describeLengthCandidate("Kotlin"))
    }

    @Test
    fun describeLengthCandidate_handlesBlankString() {
        assertEquals("STRING(blank)", describeLengthCandidate("  "))
    }

    @Test
    fun describeLengthCandidate_handlesCollection() {
        assertEquals("COLLECTION(size=3)", describeLengthCandidate(listOf(1, 2, 3)))
    }

    @Test
    fun describeLengthCandidate_handlesEmptyCollection() {
        assertEquals("COLLECTION(size=0)", describeLengthCandidate(emptyList<Int>()))
    }

    @Test
    fun describeLengthCandidate_handlesIntArray() {
        assertEquals("INT_ARRAY(size=4)", describeLengthCandidate(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun describeLengthCandidate_handlesUnsupportedValue() {
        assertEquals("NO_LENGTH", describeLengthCandidate(123))
    }
}
