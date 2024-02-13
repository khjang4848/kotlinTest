package collections

fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrNull(1))
    println(list.getOrNull(10))
}