package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class E05ValVsVarReflectionTest {

    @Test
    fun valVsVarDemo_returnsExpectedFullSummary() {
        assertEquals("val=3.14, var=5.0", valVsVarDemo())
    }

    @Test
    fun valVsVarDemo_startsWithValSegment() {
        assertTrue(valVsVarDemo().startsWith("val=3.14"))
    }

    @Test
    fun valVsVarDemo_containsVarSegment() {
        assertTrue(valVsVarDemo().contains("var=5.0"))
    }

    @Test
    fun valVsVarDemo_usesExpectedSeparator() {
        assertTrue(valVsVarDemo().contains(", "))
    }

    @Test
    fun valVsVarDemo_doesNotExposeInitialMutableValue() {
        assertTrue(!valVsVarDemo().contains("var=1.5"))
    }

    @Test
    fun valVsVarDemo_isDeterministicAcrossCalls() {
        val first = valVsVarDemo()
        val second = valVsVarDemo()
        assertEquals(first, second)
    }
}
