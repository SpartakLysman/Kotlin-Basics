package ArraysAndLists

fun main() {
    //val name: String = "Jamila, Jamas"
    val names = arrayOf<String>(// '<String>'- specifying type
        "Jamila", "Jamas", "Samee"
    )
    println(names[0])
    println(names[1])
    println(names[2])
    // println(names[3]) / nothing in here
    println(names.contentToString())

    println()

    names[1] = "Antonio"
    println(names[1])
    println(names.size)

    if ("hello" in names) {
        println("found")
    } else if ("Jamila" in names) {
        println("found")
    } else {
        println("not found")
    }
    //
    println()

    val arrayOfNulls =
        arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())

    arrayOfNulls[4] = "hello"
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("•")
    arrayOfNulls[4] = "hello"
    println(arrayOfNulls.contentToString())
}