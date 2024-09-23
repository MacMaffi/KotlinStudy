package FunctionalPrograming

fun main() {
//    val listOfNumbers = mutableListOf<Int>()
//    for (i in 0..99) {
//        listOfNumbers.add(i)
//    }

//    val listOfEvenNumbers = listOfNumbers.filter{ it % 2 == 0}
//    for (i in listOfEvenNumbers) {
//        println(i)
//    }

//    val listOfName = listOf("Alex","Dmitry","Anton","Valera")
//    val listOfAName = listOfName.filter {it -> it.startsWith("A")}
//    println(listOfAName)

//    val numbers = (0..100).toList()
//    val doubleNumbers = numbers.map {it * 2}
//    val employees = numbers.map { "Employee №$it" }
//    println(employees)

//    val array = arrayOf(5,9,-8,6,13,1)
//    val sortedArray = array.sorted()
//    val descendingSortedArray = array.sortedDescending()
//    println(sortedArray)
//    println(descendingSortedArray)

    val listOfNumbers = mutableListOf<Int>()
    for (i in 0 until 1000) {
        listOfNumbers.add((Math.random() * 1000).toInt())
    }

    val newList = listOfNumbers.filter({it % 3 == 0 || it % 5 == 0}).map({ it * it }).sortedDescending().map{it.toString()}
    for (i in newList) {
        println(i)
    }
}
