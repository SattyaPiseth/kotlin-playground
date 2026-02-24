package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class MiniChallengeTypeValidatorTest {

    @Test
    fun validateAndFormat_acceptsTrimmedString() {
        assertEquals("VALID:String(Piseth)", validateAndFormat("  Piseth  "))
    }

    @Test
    fun validateAndFormat_rejectsBlankString() {
        assertEquals("INVALID:String(blank)", validateAndFormat("   "))
    }

    @Test
    fun validateAndFormat_acceptsPositiveInt() {
        assertEquals("VALID:Int(5)", validateAndFormat(5))
    }

    @Test
    fun validateAndFormat_rejectsNegativeInt() {
        assertEquals("INVALID:Int(negative)", validateAndFormat(-1))
    }

    @Test
    fun validateAndFormat_rejectsNonFiniteDouble() {
        assertEquals("INVALID:Double(non-finite)", validateAndFormat(Double.NaN))
    }

    @Test
    fun validateAndFormat_handlesUnsupportedType() {
        assertEquals("UNSUPPORTED:ArrayList", validateAndFormat(arrayListOf(1)))
    }
}
