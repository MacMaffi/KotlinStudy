package FunctionalPrograming

fun main () {
//    val sum: (Int, Int) -> Int = {a, b -> a + b}
//    println(sum(2,10))
//    val square: (Int) -> Int = {a -> a * a}
//    val square1: (Int) -> Int = {it * it} //аналогично выше
//    println(square(5))
//    println(square1(5))
    //1 Task
    val perimetr: (Int, Int) -> Int = {a, b -> (a + b) * 2}
    println(perimetr(4,6))

    //2 Task
    val print: (String) -> Unit = {str -> println("Hello $str")}
    print("Dmitry")

    //3 Task
    val sort : (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }

    val sorterArray = sort(arrayOf(5,9,-8,6,13,1))
    for(i in sorterArray){
        println(i)
    }
}