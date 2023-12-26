fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var max = 0
    var sum = 0.0

    br.readLine().split(" ").forEach { scoreStr ->
        val score = scoreStr.toInt()
        sum += score
        max = maxOf(max, score)
    }

    val newAvg = sum / max * 100.0 / n

    print(newAvg)
}