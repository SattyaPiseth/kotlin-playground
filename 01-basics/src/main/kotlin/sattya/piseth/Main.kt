package sattya.piseth

import sattya.piseth.exercises.Membership
import sattya.piseth.exercises.classifySign
import sattya.piseth.exercises.finalPrice
import sattya.piseth.exercises.greet
import sattya.piseth.exercises.maxOfTwo
import sattya.piseth.exercises.passOrFail
import sattya.piseth.exercises.valVsVarDemo

fun main() {
//  Return Maximum number
    println("E01_maxOfTwo(0,-1) = ${maxOfTwo(0,-1)}")

//  Returns the sign classification of the given number.
    println("E02_classifySign(-1) = ${classifySign(-1)}")

//  Returns "PASS" or "FAIL" based on whether the given score meets the minimum passing threshold of 50.
    println("E03_passOrFail(49) = ${passOrFail(49)}")

//  Returns the final price after applying the membership discount.
    println("E04_finalPrice(50,GOLD) = ${finalPrice(50.0, Membership.GOLD)}")

//  Returns a deterministic summary that demonstrates immutable (`val`)
    println("E05_valVsVarDemo() = ${valVsVarDemo()}")

//  Returns a greeting for a non-blank name.
//  Use Triple-Quoted String
    println("""E06_greet("Piseth Sattya") = ${greet("Piseth Sattya")}""")
}
