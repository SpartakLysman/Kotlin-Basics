package Functions

fun main() {
    println("hello".uppercase())
    println()

    greet("Spartak", 18)
    println()
    greet("Jamila", 11)
    //greet(age = 23, name = "Jamila") // we can switch the arguments
    //
    println()

    foo(bar = {
        println("bar as a function")
    })

    println()

    foo {
        println("bar as a function2")
    }

    foo()

    println()

    println(double(10))

    //
    println()
    //

    val (v1, v2) = twoValues()
    println("$v1 $v2")
    println()

    val (t1, t2, t3) = threeValues()
    println("$t1 $t2 $t3")
    println()
}
fun twoValues(): Pair<String, Int> ="Jamila" to 20 //We can omit type specifying as well
//fun twoValues(): Pair<String, Int> {
//    return "Jamila" to 20 // can also use 'Pair("Jamila", 20)' instead of 'to...'
//}

fun threeValues(): Triple<String, Int, Char> {
    return Triple(
        "Anton",
        100,
        'A'
    )
}

fun double(n: Int): Int = n * 2 // the same as below and we can omit ': Int'
//fun double(n: Int) = n * 2 // as this
//fun double(n: Int): Int {
//    return n * 2
//}

fun foo(bar: () -> Unit = {}) {
    println("bar function")
    bar()
}

fun greet(
    name: String,
    age: Int
) { //: Unit { //Unit is the stock return type(this is optional)   / we als o can say: 'age: Int = 10', for example
    println("Hello, i'm greet $name")
    if (age >= 16) {
        println("$name is an adult")
        return
    } else {
        println("$name not an adult")
        return
    }
}