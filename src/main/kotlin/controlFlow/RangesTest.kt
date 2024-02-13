package controlFlow

fun main() {
    for(i in 0..3) {
        print(i)
    }
    print(" ")
    for(i in 0 until 3) {
        print(i)
    }
    print(" ")
    for(i in 2..8 step 2) {
        print(i)
    }

}