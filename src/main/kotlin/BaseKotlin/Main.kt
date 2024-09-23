package org.example.BaseKotlin

fun main() {
    var count = 400;
    val food = if (count > 500) {
        count-= 200
        "Pizza"
    } else if (count > 300) {
        count -= 100
        "Shaverma"
    } else {
        count -= 50
        "Dochik"
    }
    println("Вы можете позволить себе купить: $food у вас осталось: $count рублей")
}