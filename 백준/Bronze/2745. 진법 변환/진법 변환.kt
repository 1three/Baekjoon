// ASCII
// 0-9 : 48-57 (-48)
// A-Z : 65-90 (-55)

import kotlin.math.pow

fun main() = System.`in`.bufferedReader().use { br ->
    val (n, b) = br.readLine().split(" ")
    var result = 0

    for (i in n.indices) {
        val char = n[i].code
        val power = (n.length - 1 - i).toDouble()

        result += if (char <= 57) { // 숫자
            (char - 48) * b.toDouble().pow(power).toInt()
        } else { // 영어
            (char - 55) * b.toDouble().pow(power).toInt()
        }
    }
    println(result)
}