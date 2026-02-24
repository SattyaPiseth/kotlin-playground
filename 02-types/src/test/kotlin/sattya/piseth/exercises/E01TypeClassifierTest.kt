package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class E01TypeClassifierTest {

    @Test
    fun describeAnyType_handlesString() {
        assertEquals("STRING(length=6, blank=false)", describeAnyType("Kotlin"))
    }

    @Test
    fun describeAnyType_handlesBlankString() {
        assertEquals("STRING(length=3, blank=true)", describeAnyType("   "))
    }

    @Test
    fun describeAnyType_handlesEvenInt() {
        assertEquals("INT(value=4, parity=EVEN)", describeAnyType(4))
    }

    @Test
    fun describeAnyType_handlesBoolean() {
        assertEquals("BOOLEAN(value=true)", describeAnyType(true))
    }

    @Test
    fun describeAnyType_handlesFiniteDouble() {
        assertEquals("DOUBLE(value=2.5)", describeAnyType(2.5))
    }

    @Test
    fun describeAnyType_handlesUnsupportedType() {
        assertEquals("UNSUPPORTED(type=ArrayList)", describeAnyType(arrayListOf(1, 2)))
    }
}
