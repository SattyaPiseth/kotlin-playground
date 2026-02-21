# Mistake Taxonomy

Use this taxonomy to classify mistakes and generate specific reflection bullets.

## Categories

- `EXPR_STYLE`: Statement-style `if/when` used where expression return is clearer.
- `MUTABILITY`: `var` used without reassignment need.
- `NULL_UNSAFE`: Use of `!!`, unchecked nullable values, or unsafe parse assumptions.
- `INPUT_VALIDATION`: Missing invalid-input handling or ambiguous error behavior.
- `TYPE_INTENT`: Missing/unclear return types or confusing inferred types.
- `WHEN_MODELING`: Non-exhaustive `when` in closed domains or overuse of `else`.

## Reflection Prompt Fragments

- "Replace statement branching with expression returns to make result flow explicit."
- "Default to `val`; only introduce `var` when mutation is required and local."
- "Remove `!!`; model nullability explicitly and return safe outcomes."
- "Define invalid input behavior first, then encode it with guarded parsing."
- "Add explicit return types for non-trivial functions to lock intent."
- "Model domain branches with exhaustive `when` to prevent hidden paths."

## Specificity Rule

Each reflection bullet must mention at least one concrete code smell from the student submission (for example: `var result`, `if (...) { return ... } else { ... }`, `input!!.toInt()`).
