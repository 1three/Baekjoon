package com.three.baekjoon

fun main() = System.`in`.bufferedReader().use { br ->
    br.readLine().toInt() // n 미사용
    
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    
    br.readLine().split(" ").forEach { numStr ->
        val num = numStr.toInt()
        if (num < min) min = num
        if (num > max) max = num
    }

    println("$min $max")
}