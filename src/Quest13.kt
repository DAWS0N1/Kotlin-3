fun countUsers(vararg users: String){
    println("Сотрудников: ${users.size}")
}

fun main() {
    val users = arrayOf("Tom", "Bob", "Alice", "Artur", "Hope")
    countUsers(*users)
}