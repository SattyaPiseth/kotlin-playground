package sattya.piseth.exercises

/**
 * Returns a deterministic summary that demonstrates immutable (`val`)
 * and mutable (`var`) references after reassignment.
 */
fun valVsVarDemo(): String = run {
    val fixedNumber = 3.14
    var mutableNumber = 1.5
    mutableNumber = 5.0

    "val=$fixedNumber, var=$mutableNumber"
}
