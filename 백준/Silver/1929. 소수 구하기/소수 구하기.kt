import java.lang.StringBuilder
import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num <= 3) return true
    if (num % 2 == 0) return false

    for (n in 3..sqrt(num.toDouble()).toInt() step 2) {
        if (num % n == 0) return false
    }

    return true
}

fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()
    val (m, n) = br.readLine().split(" ").map { it.toInt() }

    for (num in m..n) {
        if (isPrime(num)) result.append("$num\n")
    }
    println(result)
}