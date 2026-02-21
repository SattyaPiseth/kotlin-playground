package sattya.piseth.exercises

/**
 * Returns a greeting for a non-blank name.
 *
 * @param name person name, must not be blank
 * @return greeting in the format "Hello, <name>"
 * @throws IllegalArgumentException if name is blank
 */
fun greet(name: String) =
    when {
        name.isBlank() -> throw IllegalArgumentException("name must not be blank")
        else -> "Hello, ${name.trim()}"
    }
