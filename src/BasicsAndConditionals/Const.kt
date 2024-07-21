package BasicsAndConditionals

const val PI = 3.14 //static final / with this - not allowed
val pi = gurPiValue() // allowed

fun main() {
    val name = "Jamila" //read only/ final
    //name = ""
    var i = 0 //mutable
    //i = 2
}

fun gurPiValue(): Double = 3.14