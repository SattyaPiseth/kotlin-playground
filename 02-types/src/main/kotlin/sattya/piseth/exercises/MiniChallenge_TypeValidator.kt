package sattya.piseth.exercises

/**
 * Validates and formats common runtime types for Module 02 practice.
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
