# Module 01 --- Reflection

## 🎯 Goals Reflection

### 1️⃣ Understand `val` vs `var`

**What I learned:**

-   `val` makes the reference immutable (cannot be reassigned).
-   `var` allows reassignment.
-   `val` does NOT make the object immutable.
-   Kotlin encourages immutability-first design.

**Mindset shift:**\
From thinking `val` means "completely immutable" → to understanding
reference immutability vs object mutability.

------------------------------------------------------------------------

### 2️⃣ Write Top-Level Functions

**What I learned:**

-   Kotlin does not require wrapping functions inside a class.
-   Functions can exist at the file level.
-   This reduces boilerplate and unnecessary structure.

**Mindset shift:**\
From Java-style class-heavy design → to cleaner Kotlin functional style.

------------------------------------------------------------------------

### 3️⃣ Use `if` and `when` as Expressions

**What I learned:**

-   `if` returns a value.
-   `when` returns a value.
-   No need for temporary mutable variables.
-   Expression-style code is cleaner and safer.

Example shift:

Java-style:

``` kotlin
var result: String
if (score >= 50) {
    result = "PASS"
} else {
    result = "FAIL"
}
```

Kotlin-style:

``` kotlin
val result = if (score >= 50) "PASS" else "FAIL"
```

------------------------------------------------------------------------

### 4️⃣ Understand Expression-Oriented Programming

Kotlin favors:

-   Expressions over statements
-   Immutable values
-   Concise return values

This results in code that is:

-   Shorter
-   Safer
-   Easier to read

------------------------------------------------------------------------

## 🧠 Concepts Reflection

### Variables (`val`, `var`)

-   `val` = reference cannot be reassigned
-   `var` = reference can be reassigned
-   Prefer `val` by default

------------------------------------------------------------------------

### Type Inference

Kotlin can infer types automatically:

``` kotlin
val number = 10
```

Explicit type is optional when clear.

------------------------------------------------------------------------

### Top-Level Functions

Cleaner structure:

``` kotlin
fun greet(name: String) = "Hello, $name"
```

No unnecessary class wrapping required.

------------------------------------------------------------------------

### `if` as Expression

`if` returns a value and can be used directly in assignments or returns.

------------------------------------------------------------------------

### `when` Expression

Two styles:

**Subject-based:**

``` kotlin
when (membership) { ... }
```

**Condition-based:**

``` kotlin
when { condition -> ... }
```

------------------------------------------------------------------------

## 🧪 Exercise Reflection

### E01 --- maxOfTwo

Practiced expression thinking using `if`.

### E02 --- classifySign

Understood condition-style `when`.

### E03 --- passOrFail

Removed Java-style mutable variable habit.

### E04 --- finalPrice

Applied business logic using enum + `when`.

### E05 --- valVsVarDemo

Reinforced immutability vs reassignment concept.

### E06 --- greet

Practiced expression body syntax + type inference.

------------------------------------------------------------------------

## 🚀 Mini Challenge Reflection

The discount calculator strengthened:

-   Domain modeling with `enum class`
-   Mapping logic using `when`
-   Expression chaining
-   Avoiding unnecessary mutable state

------------------------------------------------------------------------

## ✅ Completion Checklist

✔ I can explain the difference between `val` and `var`\
✔ I use `if` as an expression naturally\
✔ I prefer immutable values by default\
✔ I understand both `when(value)` and `when { }`\
✔ I avoid Java-style verbose Kotlin

------------------------------------------------------------------------

## 🧠 Biggest Mindset Shift

From writing step-by-step mutable logic\
→ To writing expression-based, immutable Kotlin code.

------------------------------------------------------------------------

## 🎯 Ready for Module 02

Module 01 prepared me to:

-   Understand Kotlin's expression-oriented design
-   Write concise and safe code
-   Think in immutable-first patterns
-   Build a foundation for Kotlin's type system

Next: **Types & Smart Casts**
