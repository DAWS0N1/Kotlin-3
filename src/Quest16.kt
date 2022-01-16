import kotlin.math.sqrt

fun main() {
    fun Double.sqrtDouble(): Double = sqrt(this)
    val x = 16.0
    println(x.sqrtDouble())
}