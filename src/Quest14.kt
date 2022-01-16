fun main() {
    infoUser("Петров И.А.", "Инженер-тестировщик")
    infoUser("Никулин М.П.", 26, "Руководитель проекта")
    infoUser("Агутин А.А.", "Холост", "Dev-Ops")
    infoUser("Маликова С.Г.", 23, "Замужем", "Аналитик")
}

fun infoUser(name: String, position: String) {
    println("ФИО: $name, Должность: $position")
}

fun infoUser(name: String, age: Int, position: String) {
    println("ФИО: $name, Возраст: $age, Должность: $position")
}

fun infoUser(name: String, maritalStatus: String, position: String) {
    println("ФИО: $name, Семейное положение: $maritalStatus, Должность: $position")
}

fun infoUser(name: String, age: Int, maritalStatus: String, position: String) {
    println("ФИО: $name, Возраст: $age, Семейное положение: $maritalStatus, Должность: $position")
}