package sattya.piseth.exercises

/**
 * Returns "PASS" or "FAIL" based on whether the given score meets
 * the minimum passing threshold of 50.
 *
 * @param score the numeric score to evaluate
 * @return "PASS" if score >= 50, otherwise "FAIL"
 */
fun passOrFail(score: Int): String =
    if (score >= 50) "PASS" else "FAIL"