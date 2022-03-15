fun main() {
    var name = "AkiraChix"
    println(name[0].toString()+name[2]+name[3])
    var b = sentence("Bakhita", 22)
    println(b)
    var y = car("Mazda")
    println(y)
    call()

}

fun sentence(x: String, y: Int): String {
    var say = "Hi, my name is ${x} and I am ${y} years old"
    return say

}
fun car(jina: String): Int {
    var auto = jina.length
    return auto

}
fun call() {
    var sayname = "jane"
    if (sayname=="Bakhita")
        println("That's me!")
    else println("That's not me.")
}