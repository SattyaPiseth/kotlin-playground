package sattya.piseth.exercises

/**
 * Adds `Int` and `Long` values using explicit conversion to show Kotlin numeric rules.
 *
 * Core concepts practiced:
 * - Kotlin numeric types are strict (`Int` is not implicitly widened to `Long`)
 * - Explicit conversion (`toLong()`) keeps arithmetic intent clear
 * - Expression-oriented Kotlin for concise numeric operations
 *
 * @param left integer value converted explicitly before addition
 * @param right long value used as the target arithmetic type
 * @return sum as `Long`
 */
fun addIntAndLong(left: Int, right: Long): Long =
    left.toLong() + right

/**
 * Returns a simple runtime type label for common Kotlin numeric types.
 *
 * Core concepts practiced:
 * - `Number` as a common supertype for Kotlin numeric classes
 * - `when` + `is` for runtime numeric type inspection
 * - Smart casts inside each `is` branch (no manual casts needed)
 *
 * @param value numeric value to classify by runtime type
 * @return simple type label, or `Number` for unhandled subclasses
 */
fun numericTypeName(value: Number): String =
    when (value) {
        is Int -> "Int"
        is Long -> "Long"
        is Double -> "Double"
        is Float -> "Float"
        is Short -> "Short"
        is Byte -> "Byte"
        else -> "Number"
    }
