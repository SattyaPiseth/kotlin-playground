package sattya.piseth.exercises

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class E04DiscountCalculatorTest {

    @Test
    fun finalPrice_appliesGoldDiscount() {
        assertEquals(80.0, finalPrice(100.0, Membership.GOLD), 1e-9)
    }

    @Test
    fun finalPrice_rejectsNaNPrice() {
        assertFailsWith<IllegalArgumentException> {
            finalPrice(Double.NaN, Membership.SILVER)
        }
    }

    @Test
    fun finalPrice_appliesSilverDiscount() {
        assertEquals(90.0, finalPrice(100.0, Membership.SILVER), 1e-9)
    }

    @Test
    fun finalPrice_appliesNoDiscountForNone() {
        assertEquals(100.0, finalPrice(100.0, Membership.NONE), 1e-9)
    }

    @Test
    fun finalPrice_allowsZeroPrice() {
        assertEquals(0.0, finalPrice(0.0, Membership.GOLD), 1e-9)
    }

    @Test
    fun finalPrice_rejectsNegativePrice() {
        assertFailsWith<IllegalArgumentException> {
            finalPrice(-1.0, Membership.GOLD)
        }
    }
}
