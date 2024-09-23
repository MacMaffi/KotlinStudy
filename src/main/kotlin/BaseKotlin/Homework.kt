package org.example.BaseKotlin

fun main() {
    var str1: String? = null;
    var str2: String? = "";
    var str3: String? = "Hello";
    val length1 = str1?.length?:0
    val length2 = str2?.length?:0
    val length3 = str3?.length?:0
    var sum = length1 + length2 + length3;
    println(sum)

}