fun main() {
    println(checkYear(1998))
    println(checkYear(2020))
    println(checkYear(2022))
}

fun checkYear(year: Int) : String {
    val leapyear = (
            year > 1584 &&
                    (
                            (year%400 == 0) ||
                                    (year%4 == 0 && year%100 != 0)
                            )
            )
    return if (leapyear)
        "$year г. - Високосный"
    else
        "$year г. - Не високосный"
}