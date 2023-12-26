package com.three.baekjoon

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }

    var min = numbers[0]
    var max = numbers[0]

    for (i in 1 until n) {
        val num = numbers[i]
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }

    println("$min $max")
}