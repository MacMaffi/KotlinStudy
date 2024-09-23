package org.example.BaseKotlin

fun main() {
    val time = 4
    val weather = false
    when{
        time in 6..22 && weather -> {
            println("Walk")
        }
        time in 6..22  && !weather -> {
            println("Read book")
        }
        else -> {
            println("Sleep")
        }
    }
}