package Loops

fun main() {
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(names[0])
    println(names[1])
    println(names[2])

    //
    println()

    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    println()

    for (number in numbers) println(number)
}