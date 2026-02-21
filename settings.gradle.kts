plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "kotlin-playground"
include("01-basics")
include("02-types")
include("03-null-safety")
include("04-lambdas-hof")
include("05-collections-ops")
include("06-classes-constructors-properties")
include("07-data-classes")
include("08-java-interop")
include("09-extensions")
include("10-generics")
include("11-sealed")
include("12-visibility")
include("13-objects-companions")
include("14-delegation")
include("15-coroutines")
include("16-dsls")
include("17-delegation-deep-dive")