package sattya.piseth.exercises

/**
 * Classifies an `Any` value by runtime type and returns a formatted summary.
 *
 * Core concepts practiced:
 * - `Any`: Kotlin's root non-null type for values of different runtime types
 * - `is`: runtime type checking (similar to `instanceof` in Java)
 * - `when`: expression-based branching for readable type-specific behavior
 * - Smart cast: after an `is` check, Kotlin lets us use type-specific members
 *   without manual casting (for example `length`, `isBlank()`, `isFinite()`)
 *
 * @param input value to classify (non-null because the type is `Any`, not `Any?`)
 * @return formatted type description string for supported and unsupported inputs
 */
fun describeAnyType(input: Any): String =
    when (input) {
        is String -> "STRING(length=${input.length}, blank=${input.isBlank()})"
        is Int -> "INT(value=$input, parity=${if (input % 2 == 0) "EVEN" else "ODD"})"
        is Boolean -> "BOOLEAN(value=$input)"
        is Double ->
            when {
                !input.isFinite() -> "DOUBLE(non-finite)"
                else -> "DOUBLE(value=$input)"
            }
        else -> "UNSUPPORTED(type=${input.javaClass.simpleName})"
    }
