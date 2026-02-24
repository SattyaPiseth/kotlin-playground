package sattya.piseth.exercises

/**
 * Demonstrates smart casts by describing values that expose a length/size concept.
 *
 * Core concepts practiced:
 * - `Any`: accept different non-null runtime types through one function parameter
 * - `is`: runtime type checks for branching logic
 * - `when`: expression-based type dispatch
 * - Smart cast: Kotlin narrows the type after `is` checks, so we can use
 *   `length`/`size` without manual casting
 * - `Collection<*>`: type-safe handling of collections when element type is irrelevant
 *
 * @param input candidate value that may or may not expose length/size semantics
 * @return formatted description for supported types, or `NO_LENGTH` otherwise
 */
fun describeLengthCandidate(input: Any): String =
    when (input) {
        is String -> if (input.isBlank()) "STRING(blank)" else "STRING(length=${input.length})"
        is Collection<*> -> "COLLECTION(size=${input.size})"
        is IntArray -> "INT_ARRAY(size=${input.size})"
        else -> "NO_LENGTH"
    }
