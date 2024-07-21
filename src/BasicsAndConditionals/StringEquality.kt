package BasicsAndConditionals

fun main() {
    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = "Saleh"
    val name3New = String("Saleh".toCharArray())

    println("== ${name1 == name3New}")
    println("=== ${name1 === name3New}")//comparing values in string pool
    println(".equals ${name1.equals(name3New)}")
}