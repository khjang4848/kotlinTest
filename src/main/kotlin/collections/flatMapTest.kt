package collections

fun main() {
    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }
    println(mapBag)// 4
    val flatMapBag = cart.flatten()
    println(flatMapBag)

}