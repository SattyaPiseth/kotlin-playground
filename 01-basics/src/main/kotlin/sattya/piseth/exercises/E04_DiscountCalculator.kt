package sattya.piseth.exercises


/**
 * Calculates the final price after applying membership discount.
 *
 * @param price original price before discount
 * @param membership membership tier used to determine discount rate
 * @return price after discount is applied
 */
enum class Membership { GOLD, SILVER, BRONZE, NONE }

fun finalPrice(price: Double, membership: Membership): Double =
    price - (price * when (membership) {
        Membership.GOLD -> 0.20
        Membership.SILVER -> 0.10
        Membership.BRONZE -> 0.05
        Membership.NONE -> 0.0
    })
