package delegation

import kotlin.reflect.KProperty


class Example {
    var p: String by Delegate()

    override fun toString(): String {
        return "Example Class"
    }
}
class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }

}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}