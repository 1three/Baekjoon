fun main() = System.`in`.bufferedReader().use { br ->
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val m = if (n - k < k) n - k else k
    var result = 1

    for (i in 0 until m) {
        result = result * (n - i) / (i + 1)
    }

    println(result)
}
