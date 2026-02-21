package sattya.piseth.exercises

/**
 * Returns the sign classification of the given number.
 *
 * Uses expression body syntax for conciseness.
 *
 * @param number the integer to classify
 * @return "NEGATIVE" if number < 0,
 *         "ZERO" if number == 0,
 *         otherwise "POSITIVE"
 */

/**
 * Demonstrates expression body syntax.
 *
 * In Kotlin, when a function consists of a single expression,
 * the `return` keyword and braces can be omitted.
 *
 * Example:
 * `fun function(...) = expression`
 */

fun classifySign(number: Int): String =
    when {
        number < 0 -> "NEGATIVE"
        number == 0 -> "ZERO"
        else -> "POSITIVE"
    }

