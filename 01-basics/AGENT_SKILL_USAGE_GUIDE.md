# 📘 Kotlin Module 01 Coach

**Agent Skill Usage Guide**\
Skill Name: `kotlin-module01-coach`\
Location: `.agents/skills/kotlin-module01-coach/`

------------------------------------------------------------------------

## 1. Purpose

`kotlin-module01-coach` is a structured coaching skill designed to
enforce high-quality Kotlin fundamentals during Module 01 exercises.

It standardizes:

-   Expression-oriented Kotlin
-   Immutability-first thinking
-   Safe input validation
-   Strong type-system awareness
-   Deterministic unit testing
-   Structured reflection after each exercise

This skill transforms learning from ad-hoc experimentation into a
disciplined engineering workflow.

------------------------------------------------------------------------

## 2. Core Philosophy

### 2.1 Expression-Oriented Design

-   Prefer `if` and `when` as expressions.
-   Avoid Java-style statement blocks when expression form is possible.

### 2.2 Immutability First

-   Default to `val`.
-   Justify any `var`.
-   Avoid mutable intermediate placeholders.

### 2.3 Safe Kotlin

-   Strictly forbid `!!`.
-   Explicitly define invalid-input behavior.
-   Use `require`, safe parsing, or safe calls when necessary.

### 2.4 Type-System Clarity

-   Use enums for closed domains.
-   Enforce exhaustive `when` on enums.
-   Prefer explicit return types when clarity matters.

### 2.5 Test Discipline

-   Generate `kotlin.test` unit tests.
-   Place tests under `src/test/kotlin`.
-   Include boundary and invalid-input cases.
-   Use floating-point tolerance where needed.

------------------------------------------------------------------------

## 3. Output Contract (Enforced Structure)

Every skill execution must return exactly six sections in order:

1.  Refactor to idiomatic Kotlin\
2.  Explanation (5--10 bullets)\
3.  Test Plan (6 cases + expected outputs)\
4.  Test Code (exact file path + full file content)\
5.  Reflection Bullets (6--10, specific to mistakes)\
6.  One Reusable Rule for Next Time

Additionally:

-   A **"Quiz Me" subsection** follows Explanation.
-   It contains exactly 2 short questions.
-   Questions are not answered unless explicitly requested.

------------------------------------------------------------------------

## 4. When to Use This Skill

Use `kotlin-module01-coach` when:

-   Reviewing Module 01 exercises (E01--E06).
-   Refactoring beginner Kotlin code.
-   Generating structured unit tests.
-   Enforcing immutability and expression style.
-   Appending structured reflection entries.
-   Performing pre-commit review for Module 01.

Do not use it for:

-   General Kotlin questions.
-   Architecture brainstorming.
-   Exploratory language discussions.
-   Non-Module-01 topics.

------------------------------------------------------------------------

## 5. Standard Usage Patterns

### Review a Single Exercise

    Use skill kotlin-module01-coach.

    Exercise: E02_ClassifySign
    Review file:
    01-basics/src/main/kotlin/sattya/piseth/exercises/E02_ClassifySign.kt

    Follow contract strictly.

------------------------------------------------------------------------

### Batch Review All Exercises

    Use skill kotlin-module01-coach.

    Batch review:
    Open and review all files under:
    01-basics/src/main/kotlin/sattya/piseth/exercises/

    Apply contract to each file.
    Summarize recurring strengths and weaknesses.

------------------------------------------------------------------------

### Append to REFLECTION.md (Append-Only)

    Use skill kotlin-module01-coach.

    Append reflection summaries into:
    01-basics/REFLECTION.md

    Rules:
    - Add headings per exercise.
    - Append only.
    - Do not rewrite existing content.
    - Show diff before applying.

------------------------------------------------------------------------

### Pre-Commit Quality Gate

    Use skill kotlin-module01-coach.

    Review staged files under src/main only.
    If contract violations exist, fix them before commit.
    Otherwise confirm clean.

------------------------------------------------------------------------

## 6. Git Workflow Integration

Recommended commit pattern:

### Commit 1 --- Production Code

Refine Module 01 solutions (expression-oriented + safe contracts)

### Commit 2 --- Tests

Add kotlin.test coverage for Module 01 (E01--E06)

Optional third commit: Update Module 01 reflection (E01--E06)

------------------------------------------------------------------------

## 7. Learning Reinforcement Strategy

After each exercise:

1.  Review refactor.
2.  Answer Quiz Me questions.
3.  Run tests.
4.  Append reflection.
5.  Extract reusable rule.

------------------------------------------------------------------------

## 8. Expected Outcomes

By consistently using this skill, the developer will:

-   Think in expressions instead of statements.
-   Default to immutability.
-   Define explicit input contracts.
-   Use enums for closed domains.
-   Write deterministic tests immediately.
-   Maintain clean, minimal, contract-focused documentation.

------------------------------------------------------------------------

**End of Document**
