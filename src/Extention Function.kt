package Function

fun String.holla() : String = "Holla $this"

fun String.printSemangat() : Unit = println("Semangat $this")

fun main() {
    val name = "Ratih"
    println(name.holla())

    name.printSemangat()
    "Eldina".printSemangat()

}