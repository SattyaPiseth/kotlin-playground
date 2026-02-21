package sattya.piseth.exercises


/**
 * Goal: demonstrate understanding of val vs var.
 *
 * Task:
 * - Create a `val` for an immutable reference
 * - Create a `var` that is reassigned
 * - Return a single String summary like:
 *   "val=<value>, var=<value>"
 *
 * Rules:
 * - Use type inference at least once (no explicit type)
 */
fun valVsVarDemo(): String {
    val fixedNumber = 3.14
    var mutableNumber = 1.5
    mutableNumber = 5.0

    return "val=$fixedNumber, var=$mutableNumber"
}
