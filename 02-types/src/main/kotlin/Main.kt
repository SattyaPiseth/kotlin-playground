package sattya.piseth

import sattya.piseth.exercises.addIntAndLong
import sattya.piseth.exercises.describeAnyType
import sattya.piseth.exercises.describeLengthCandidate
import sattya.piseth.exercises.numericTypeName
import sattya.piseth.exercises.validateAndFormat

fun main() {
    println("E01 describeAnyType(42) = ${describeAnyType(42)}")
    println("E02 describeLengthCandidate(\"Kotlin\") = ${describeLengthCandidate("Kotlin")}")
    println("E03 addIntAndLong(10, 20L) = ${addIntAndLong(10, 20L)}")
    println("E03 numericTypeName(3.14) = ${numericTypeName(3.14)}")
    println("Mini validateAndFormat(\"  Piseth  \") = ${validateAndFormat("  Piseth  ")}")
}
