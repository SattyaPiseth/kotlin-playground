package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class E06TopLevelAndInferenceTest {

    @Test
    fun greet_returnsGreeting_forSimpleName() {
        assertEquals("Hello, Alice", greet("Alice"))
    }

    @Test
    fun greet_trimsLeadingAndTrailingSpaces() {
        assertEquals("Hello, Bob", greet("  Bob  "))
    }

    @Test
    fun greet_preservesInnerSpaces() {
        assertEquals("Hello, Mary Jane", greet("Mary Jane"))
    }

    @Test
    fun greet_acceptsSingleCharacterName() {
        assertEquals("Hello, Z", greet("Z"))
    }

    @Test
    fun greet_rejectsEmptyName() {
        assertFailsWith<IllegalArgumentException> {
            greet("")
        }
    }

    @Test
    fun greet_rejectsWhitespaceOnlyName() {
        assertFailsWith<IllegalArgumentException> {
            greet("   ")
        }
    }
}
