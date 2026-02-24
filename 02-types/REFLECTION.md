# Module 02 --- Reflection

## Goals Reflection

### 1) Understand Type Inference and Type Contracts

What I learned:

- Kotlin can infer types when intent is obvious.
- Explicit return types improve clarity for exercise functions.
- The function contract matters for type inputs (`Any` vs `Any?`).
- Type design is part of safety, not just syntax.

Mindset shift:
From "the compiler can figure it out" to "I should make type intent explicit where it improves correctness and readability."

------------------------------------------------------------------------

### 2) Use `is` and Smart Casts

What I learned:

- `is` checks runtime type safely.
- Kotlin smart-casts inside `if`/`when` branches after `is` checks.
- Manual casting is often unnecessary and less safe.
- `when (input)` + `is` branches is the clean Kotlin pattern for type-based logic.

Mindset shift:
From Java-style `instanceof` + cast steps to Kotlin smart-cast flow with fewer moving parts.

------------------------------------------------------------------------

### 3) Understand Kotlin Numeric Type Rules

What I learned:

- Kotlin numeric types are strict.
- `Int` does not implicitly widen to `Long`.
- Explicit conversion (`toLong()`) makes arithmetic intent clear.
- `Number` is useful for classification, but not ideal for general arithmetic APIs.

Mindset shift:
From assuming Java numeric widening to writing explicit numeric conversions in Kotlin.

------------------------------------------------------------------------

## Concepts Reflection

### `Any` vs `Any?`

- `Any` accepts any non-null value.
- `Any?` includes `null` and requires explicit handling.
- Choosing between them is a contract decision.

------------------------------------------------------------------------

### `is` Keyword + Smart Cast

- `is` performs runtime type checking.
- After `is`, Kotlin narrows the type in that branch.
- Smart casts reduce manual cast noise and cast-related errors.

------------------------------------------------------------------------

### `when` for Type Branching

- `when` works well for runtime type dispatch.
- Branches stay readable as logic grows.
- Explicit `else` fallback is important for unsupported types.

------------------------------------------------------------------------

### Numeric Types and Conversion

- Explicit conversion is required across numeric types.
- This prevents hidden widening assumptions.
- Kotlin encourages intentional arithmetic types.

------------------------------------------------------------------------

## Exercise Reflection

### E01 --- Type Classifier

Practiced `Any`, `is`, `when`, and smart casts in one function.
Built explicit unsupported-type behavior.

### E02 --- Smart Cast Length

Applied smart casts to `String`, `Collection<*>`, and `IntArray` without manual casts.
Used a stable fallback (`NO_LENGTH`) for unsupported values.

### E03 --- Numeric Conversions

Practiced explicit numeric conversion (`toLong()`) and runtime numeric type classification using `Number`.

### Mini Challenge --- Type Validator

Combined type branching, smart casts, validation rules, and stable `VALID/INVALID/UNSUPPORTED` output formatting.

------------------------------------------------------------------------

## Backend Relevance Reflection (Spring Boot)

This module helped with patterns used in backend code:

- Validating heterogeneous values from dynamic payloads (`Map<String, Any>`)
- Avoiding unsafe manual casts in parsing/validation paths
- Defining explicit fallback behavior for unsupported runtime types
- Treating numeric conversion and non-finite values as explicit validation concerns

------------------------------------------------------------------------

## Completion Checklist

x I understand smart casts
x I avoid manual casting when smart casts are sufficient
x I can explain Kotlin type system basics used in Module 02
x I can write explicit fallback behavior for unsupported runtime types
x I can apply explicit numeric conversion rules in Kotlin

------------------------------------------------------------------------

## Biggest Mindset Shift

From writing type checks as multi-step Java-style logic
To writing expression-based Kotlin with `when` + smart casts + explicit contracts.

------------------------------------------------------------------------

## Ready for Module 03

Module 02 prepared me to:

- Think more clearly about Kotlin type contracts
- Use smart casts safely and idiomatically
- Handle mixed runtime types with explicit fallback behavior
- Respect Kotlin numeric conversion rules

Next: Null Safety (`Any?`, nullable types, safe calls, Elvis, null-aware control flow)
