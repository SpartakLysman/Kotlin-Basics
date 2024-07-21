package BasicsAndConditionals

fun main() {
    val isAdult = false
    val isFemale = true
    val isDriver = true
    println(isAdult && (isFemale || isDriver))

    println(isAdult || isFemale || isDriver)
    println(!isAdult)
}