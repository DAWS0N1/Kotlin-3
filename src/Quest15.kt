fun main() {
    val users = arrayOf("Tom", "Bob", "Alice", "Artur", "Hope")

    val out = {array: Array<String> -> array.forEach { println(it) }}

    out(users)
}