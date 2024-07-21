package BasicsAndConditionals

fun main() {
    val name = "Ahmed"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[4])
    println(
        name
        //... .
    )
    val age = 20

    val msg = "Name: $name, Age: $age"//"${name} ${age}" //  name + " " + age
    //val msg: String = ...

    val msgNew = "Name: ${name.uppercase()}, Age: $age"
    println(msg)

    println()

    val email = """
         Hello %s
           How
           Are
           You
         ???????
     """.trimIndent()
    println(email.format("Jamila"))
}