import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val cards = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }

    val map = HashMap<Int, Int>()
    val result = StringBuilder()

    for (i in 0 until n) {
        val key = cards[i]
        map[key] = map.getOrDefault(key, 0) + 1
    }

    for (j in 0 until m) {
        val key = numbers[j]
        val count = map.getOrDefault(key, 0)
        result.append(count).append(" ")
    }

    println(result)
}