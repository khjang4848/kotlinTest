package delegation

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n:String) : SoundBehavior {
    override fun makeSound() {
        println("${n.uppercase()} !!!")
    }
}

class RockAndRollBehavior(val n:String): SoundBehavior {                           // 2
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tom = TomAraya("임수민 만세")
    tom.makeSound()
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}
