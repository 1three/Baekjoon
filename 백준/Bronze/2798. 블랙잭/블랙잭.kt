fun main() = System.`in`.bufferedReader().use { br ->
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val cards = br.readLine().split(" ").map { it.toInt() }
    var maxSum = 0

    for (i in 0..<n - 2) {
        val iNum = cards[i]
        for (j in i + 1..<n - 1) {
            val jNum = cards[j]
            for (k in j + 1..<n) {
                val sum = iNum + jNum + cards[k]
                if (sum in (maxSum + 1)..m) {
                    maxSum = sum
                }
            }
        }
    }

    println(maxSum)
}