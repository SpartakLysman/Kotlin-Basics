package BasicsAndConditionals

fun main() {
    val n1 = 31
    val n2 = 20

    if (n1 > n2 && n1 <= 30) {// can do: val value = if(...... , and then print 'value'
        println(":)")// also can return instead printion
    } else if (n1 == 100) {
        println(":(")
    } else if (n1 == 200) {
        println(":(")
    } else {
        println("Hello")
    }
    // var result = n1 >= n2 ? ":)" : ":("
    val result1 = if (n1 >= n2) ":)" else ":("
    println(result1)

    val result2 =
        if (n1 >= n2) ":)"
        else if (n1 == 100) "hooray"
        else if (n1 == 100) "hooray 200"
        else ":("
    println(result2)
}