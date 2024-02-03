fun main() = System.`in`.bufferedReader().use { br ->
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val result = factorial(n) / (factorial(k) * factorial(n - k))

    println(result)
}

tailrec fun factorial(n: Int, acc: Long = 1): Long { // acc : accumulate (누적)
    return if (n <= 1) {
        acc
    } else {
        factorial(n - 1, n * acc)
    }
}