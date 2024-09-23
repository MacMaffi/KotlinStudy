package BaseKotlin

fun main() {
    println(volume(10))
}

fun printInfo(lastName: String = "", firstName: String = "", patronymic: String = "") {
    if(lastName.isNotEmpty()){
        println("Фамилия: $lastName")
    }
    if(firstName.isNotEmpty()){
        println("Имя: $firstName")
    }
    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}

fun volume (a: Int, b: Int = a, c: Int = a) = a * b * c