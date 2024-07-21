package Loops

fun main() {
    println("ranges")
    for (i in 1..5) println(i)
    println()
    println("downTo")
    for (i in 5 downTo 1) println(i)

    println()

    println("steps")
    for (i in 1..5 step 2) println(i)
    println()
    println("stepsDown")
    for (i in 5 downTo 1 step 2) println(i)
}