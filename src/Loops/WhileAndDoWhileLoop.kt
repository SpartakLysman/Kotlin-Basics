package Loops

fun main() {
    var number = 1
    while (number <= 5) {
        println("Number $number")
        ++number
    }

    println()
    println("reverse")
    println()
    var number2 = 5
    while (number2 >= 0) {
        println("Number $number2")
        --number2
    }

    println()

    val brand = "amigoscode" //Can also be an array intead
    var index = brand.length - 1 // index = 0 for simple loop // Also is we say val index, -- index won't work ;)

    while (index >= 0) { // index <= bramd.length - 1 for simple loop
        println("Letter ${brand[index]}")
        --index // index++ here
    }

    println()
    //DoWhileLoop
    println("DoWhileLoop")

    do {
        println("hello")
    } while (false)

    println()
    //BreakAndContinue
    println("BreakAndContinue")

    val nums = intArrayOf(1, 2, 3, 4, 5)
    for (n in nums) {
        if (n == 2) {
            continue
        }
        println(n) //Skip number '2'
    }

    println()

    val nums2 = intArrayOf(1, 2, 3, 4, 5)
    for (n in nums2) {
        if (n % 2 != 0) {
            continue
        }
        println(n)
    }

    println()

    val nums3 = intArrayOf(
        1, 2, 3, 4, 5, 6, 7, 8
    )
    for (n in nums3) {
        if (n % 2 != 0) continue
        if (n > 6) break
        println(n) //Even numbers up to 6 ;)
    }
}