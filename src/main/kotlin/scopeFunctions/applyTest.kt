package scopeFunctions



data class Person(var name: String, var age: Int, var about: String) {
    constructor(): this("", 0, "")
}

fun main() {
    val jake = Person().apply {
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()

    println(jake)
}