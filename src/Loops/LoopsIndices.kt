package Loops

fun main() {
    val letters = charArrayOf('A', 'B', 'C', 'D','E')
    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }

    println()
    println("reverse")
    println()

    for (index in letters.indices.reversed()) {
        println("$index - ${letters[index]}")
    }
}