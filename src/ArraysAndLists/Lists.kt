package ArraysAndLists

fun main() {
    val names: List<String> = listOf( //We cannot add any more elements. Read-only
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )
    println(names[0])
    println(names.size)
    println(names.contains("Peter"))
    println(names.contains("Foo"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Peter"))
    println(names)

    println()

    val namesMutable = mutableListOf(//Now we can add more elements :)
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )
    println(namesMutable[0])
    println(namesMutable.size)
    println(namesMutable.contains("Peter"))
    println(namesMutable.contains("Foo"))
    println(namesMutable.first())
    println(namesMutable.last())
    println(namesMutable.indexOf("Peter"))
    println(namesMutable)

    namesMutable.remove("Saleh")
    println(namesMutable)
    namesMutable.add("Alex")
    println(namesMutable)
    println(namesMutable.isEmpty())
    val mutableList = mutableListOf<Any>()
    println(mutableList.isEmpty())
}