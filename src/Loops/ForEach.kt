package Loops

fun main() {
    val names = listOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter",
        "Antonio",
    )
    for (name in names) println(name)
    println()
    names.forEach { println(it) }
}