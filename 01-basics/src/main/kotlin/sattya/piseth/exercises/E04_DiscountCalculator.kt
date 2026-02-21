package sattya.piseth.exercises

enum class Membership { GOLD, SILVER, BRONZE, NONE }

/**
 * Returns the final price after applying the membership discount.
 *
 * @param price original price (must be finite and non-negative)
 * @param membership membership tier determining discount rate
 * @return discounted price
 * @throws IllegalArgumentException if price is negative or not finite
 */
fun finalPrice(price: Double, membership: Membership): Double {
    require(price.isFinite() && price >= 0.0) { "price must be finite and non-negative" }

    val discountRate = when (membership) {
        Membership.GOLD -> 0.20
        Membership.SILVER -> 0.10
        Membership.BRONZE -> 0.05
        Membership.NONE -> 0.0
    }

    return price * (1 - discountRate)
}