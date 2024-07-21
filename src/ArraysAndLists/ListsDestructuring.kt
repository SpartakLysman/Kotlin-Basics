package ArraysAndLists

fun main() {
    val names = listOf( //We cannot add any more elements. Read-only
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )

    //
    val j = names[0]
    val ja = names[1]
    val s = names[2]
    //
    val (one, two, three) = names
    println("$one $two $three")

    //or
    val (one1, two1, _, four) = names
    println("$one1 $two1 $four")
}