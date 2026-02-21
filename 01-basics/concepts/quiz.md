# Module 01 --- Warm-Up Quiz (Multiple Choice)

This quiz reinforces:

-   `val` vs `var`
-   Type inference
-   Top-level functions
-   `if` as expression
-   `when` expression
-   Expression-oriented programming

------------------------------------------------------------------------

## Part 1 --- Variables & Immutability

1.  What does `val` mean in Kotlin?

    A)  The variable is completely immutable\
    B)  The reference cannot change\
    C)  The object cannot mutate\
    D)  It behaves like `static final`

2.  What does `var` allow?

    A)  Reassigning the reference\
    B)  Mutating the object only\
    C)  Both A and B\
    D)  Neither

3.  What happens here?

    ``` kotlin
    val list = mutableListOf(1, 2, 3)
    list.add(4)
    ```

    A)  Compilation error\
    B)  Runtime error\
    C)  Works correctly\
    D)  `val` prevents mutation

4.  Which statement is TRUE?

    A)  `val` makes objects immutable\
    B)  `var` should be preferred in Kotlin\
    C)  Kotlin encourages immutability\
    D)  `var` behaves like `final`

------------------------------------------------------------------------

## Part 2 --- Expression-Oriented Programming

5.  Which is expression-style Kotlin?

    A)  

    ``` kotlin
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    ```

    B)  

    ``` kotlin
    val max = if (a > b) a else b
    ```

    C)  

    ``` kotlin
    if (a > b) return a else return b
    ```

    D)  

    ``` kotlin
    val max: Int
    ```

6.  What does this return?

    ``` kotlin
    val result = if (5 > 10) "A" else "B"
    ```

    A)  "A"\
    B)  "B"\
    C)  true\
    D)  Compilation error

7.  Why is Kotlin called expression-oriented?

    A)  It requires more expressions\
    B)  Control structures return values\
    C)  It avoids classes\
    D)  It removes functions

------------------------------------------------------------------------

## Part 3 --- `when` Expression

8.  When should you use `when { }` instead of `when(value)`?

    A)  When matching exact values\
    B)  When checking Boolean conditions\
    C)  Only when using ranges\
    D)  Always

9.  What is wrong with this code?

    ``` kotlin
    when (score) {
        score > 50 -> "PASS"
        else -> "FAIL"
    }
    ```

    A)  Syntax error\
    B)  Type mismatch (Int vs Boolean)\
    C)  Missing return statement\
    D)  Nothing is wrong

10. Which of these is valid Kotlin?

    A)  

    ``` kotlin
    when (x) {
        in 1..10 -> "LOW"
    }
    ```

    B)  

    ``` kotlin
    when {
        x > 0 -> "POSITIVE"
    }
    ```

    C)  

    ``` kotlin
    when (x) {
        x > 0 -> "POSITIVE"
    }
    ```

    D)  Both A and B

11. Does `when` always require `else`?

    A)  Yes\
    B)  No\
    C)  Only inside functions\
    D)  Only with Int

------------------------------------------------------------------------

## Part 4 --- Type Inference & Top-Level Functions

12. Which demonstrates type inference?

    A)  

    ``` kotlin
    val age: Int = 25
    ```

    B)  

    ``` kotlin
    val age = 25
    ```

    C)  

    ``` kotlin
    var age
    ```

    D)  

    ``` kotlin
    val age: String
    ```

13. Is this valid Kotlin?

    ``` kotlin
    fun greet() = "Hello"
    ```

    A)  No, return type required\
    B)  Yes\
    C)  Only inside a class\
    D)  Only in main

14. What is a top-level function?

    A)  A function inside `main`\
    B)  A function inside a class\
    C)  A function declared outside any class\
    D)  A function inside a package object

15. What will this print?

    ``` kotlin
    fun main() {
        val x = 10
        val result = when {
            x < 5 -> "LOW"
            x < 15 -> "MEDIUM"
            else -> "HIGH"
        }
        println(result)
    }
    ```

    A)  LOW\
    B)  MEDIUM\
    C)  HIGH\
    D)  Compilation error

------------------------------------------------------------------------

## Mastery Target

-   Aim for at least 12/15 correct.
-   Review mistakes before moving to Module 02.
