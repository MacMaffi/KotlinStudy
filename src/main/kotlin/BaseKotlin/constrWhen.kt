package org.example.BaseKotlin

fun main() {
    val nameofMonth = "March"

    val season = when(nameofMonth) {
        "December", "January", "Febrary" -> {
            "Winter"
        }
        "March", "April", "May" -> {
            "Spring"
        }
        "June","July","August" -> {
            "Summer"
        }
        "September","October","November" -> {
            "Autumn"
        }
        else -> {
            "Not found"
        }
    }
    println(season)
}