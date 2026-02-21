package sattya.piseth.exercises


/**
 * Mini Challenge:
 * Input: price and membership level
 * Output: final price after discount
 * Use `when` expression only to choose discount.
 */
enum class Membership { GOLD, SILVER, BRONZE, NONE }

fun finalPrice(price: Double, membership: Membership): Double {
    TODO("Use when(membership) to pick discount rate, then return price - price*rate")
}
