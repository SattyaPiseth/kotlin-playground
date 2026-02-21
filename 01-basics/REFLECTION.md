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

## E01 — Max of Two

- Keep this as one expression; don’t expand to mutable/block style.
- Always include equality case in comparison tests.
- Always include integer boundary checks.
- Keep the function pure and deterministic.
- Add minimal KDoc only if contract complexity grows.
- Keep naming aligned with problem statement.

## E02 — Classify Sign

- Remove tutorial blocks once function is complete.
- Keep `when` formatting idiomatic and consistent.
- Preserve expression-body style for simple classification.
- Include both typical and boundary integer tests.
- Keep output vocabulary consistent (`NEGATIVE/ZERO/POSITIVE`).
- Prefer minimal, contract-level comments only.

## E03 — Pass or Fail

- Define valid domain upfront for numeric APIs.
- Don’t leave out-of-range behavior implicit.
- Prefer expression-style branching over multi-step mutable flow.
- Document exception behavior when it is part of contract.
- Include invalid-input tests in the initial test set.
- Keep PASS/FAIL threshold explicit and tested at boundary.

## E04 — Discount Calculator

- Keep enum-based discount modeling; avoid stringly-typed tiers.
- Always define invalid money input behavior explicitly.
- Include precision tolerance in floating-point assertions.
- Add at least one invalid-input test from the start.
- Keep discount logic immutable and transparent.
- Ensure documentation mentions constraints and exceptions.

## E05 — Val vs Var Reflection

- Keep `var` only where mutation is the point of the exercise.
- Remove tutorial prose from final source.
- Keep result shape deterministic for easy assertions.
- Use expression style even in demonstration functions.
- Test both positive expectations and “must not contain” conditions.
- Keep comments minimal and contract-focused.

## E06 — Top-Level and Inference

- Define invalid-input behavior for user-facing text functions.
- Keep top-level functions concise and expression-based.
- Normalize input when output should be user-friendly.
- Keep KDoc minimal but include constraints/exceptions.
- Don’t leave blank/whitespace behavior implicit.
- Include both valid formatting and invalid-input tests.
