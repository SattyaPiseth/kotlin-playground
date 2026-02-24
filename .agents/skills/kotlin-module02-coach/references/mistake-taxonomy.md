# Module 02 Mistake Taxonomy

Use these categories to generate targeted feedback and quiz questions.

## Categories

- `TYPE_BRANCHING`: Uses weak branching instead of `when` + `is` for runtime type logic.
- `MANUAL_CAST`: Uses `as` where smart cast is sufficient.
- `NULL_CONTRACT`: Null handling is missing or unclear (`Any` vs `Any?`).
- `UNSUPPORTED_CONTRACT`: Unsupported-type fallback is missing or unstable.
- `NUMERIC_CONVERSION`: Assumes implicit widening; missing explicit conversion.
- `NUMBER_ABUSE`: Uses `Number` for arithmetic where a concrete numeric type is clearer.
- `DOC_INTENT`: Missing KDoc for constraints, supported types, or fallback behavior.

## Reflection Prompt Fragments

- "Replace manual cast with `is` + smart cast in the branch that uses type-specific members."
- "Make nullability part of the function contract (`Any` vs `Any?`) and handle it explicitly."
- "Define a stable unsupported-type fallback instead of relying on ad-hoc formatting."
- "Use explicit numeric conversion to document arithmetic intent in Kotlin."
- "Keep `Number` for classification, not general arithmetic APIs."

## Quiz Guidance

Ask questions that test:
- why smart casts work,
- when they fail,
- explicit numeric conversion rules,
- nullability contract design,
- Spring Boot relevance for dynamic payload validation.
