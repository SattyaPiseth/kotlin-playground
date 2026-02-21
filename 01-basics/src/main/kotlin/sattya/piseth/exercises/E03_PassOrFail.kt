package sattya.piseth.exercises

/**
 * Returns "PASS" or "FAIL" based on whether the given score meets
 * the minimum passing threshold of 50.
 *
 * @param score the numeric score to evaluate, expected in the range 0..100
 * @return "PASS" if score >= 50, otherwise "FAIL"
 * @throws IllegalArgumentException if score is outside 0..100
 */
fun passOrFail(score: Int): String =
    when {
        score !in 0..100 -> throw IllegalArgumentException("score must be in 0..100")
        score >= 50 -> "PASS"
        else -> "FAIL"
    }
