package sattya.piseth.exercises

/**
 * Validates and formats common runtime types for Module 02 practice.
 *
 * Core concepts practiced:
 * - `Any`: accept heterogeneous non-null runtime values through one API
 * - `is`: runtime type checks for type-specific validation branches
 * - `when`: expression-based branching for readable validation and formatting
 * - Smart cast: Kotlin narrows types after `is` checks (no manual casts needed)
 * - Explicit unsupported-type fallback for stable behavior on unknown inputs
 *
 * @param input value to validate and format (non-null because the type is `Any`)
 * @return formatted `VALID`, `INVALID`, or `UNSUPPORTED` result string
 */
fun validateAndFormat(input: Any): String =
    when (input) {
        is String ->
            when {
                input.isBlank() -> "INVALID:String(blank)"
                else -> "VALID:String(${input.trim()})"
            }
        is Int -> if (input < 0) "INVALID:Int(negative)" else "VALID:Int($input)"
        is Double ->
            when {
                !input.isFinite() -> "INVALID:Double(non-finite)"
                input < 0.0 -> "INVALID:Double(negative)"
                else -> "VALID:Double($input)"
            }
        is Boolean -> "VALID:Boolean($input)"
        else -> "UNSUPPORTED:${input.javaClass.simpleName}"
    }
