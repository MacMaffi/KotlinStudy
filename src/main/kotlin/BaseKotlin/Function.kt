package BaseKotlin

fun main() {
//    println(max(5, 10))
//    println(string("HelloWorld!"))
//    println(sum(1,2,3))
    val  numbers = mutableListOf(5,8,12,-2,6,5)
    println(sort(numbers))
}

fun max (a: Int, b: Int) = if (a > b) a else b

fun string (str : String) = str.substring(0, Math.min(5, str.length))

fun sum(vararg numbers: Int) : Int {
    var result = 0;
    for (num in numbers) {
        result += num
    }
    return result
}

fun sort(numbers : MutableList <Int>) : List<Int> {
    for (i in 1 until numbers.size) {
        for (j in  0  until numbers.size - i  ) {
            if (numbers[j + 1] < numbers[j]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j +1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())