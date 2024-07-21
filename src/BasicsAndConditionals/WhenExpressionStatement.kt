package BasicsAndConditionals

fun main() {
    val gender = "F"

    when (gender) {
        "F" -> println("FEMALE")
        "M" -> println("MALE")
        else -> {
            println("Unknown Gender")
        }
    }
    //Or
    println()

    val input = "M"
    val gender2 = when (input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> {
            "Unknown Gender"
        }
    }
    println(gender2)

    //is else to when
    val n1 = 10
    val n2 = 20
    when {
        (n1 >= n2 || n1 <= 30) ->  println(":)")
        (n1 == 100) ->  println(":(")
        else -> println("foo")
    }

    println()

    val age = 18
    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("Child")
        else -> println(":)")
    }
}