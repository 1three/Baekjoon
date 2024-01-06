import java.lang.StringBuilder
import java.util.PriorityQueue

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>()
    val result = StringBuilder()

    repeat(n) {
        val m = br.readLine().toInt()
        pq.add(m)
    }

    while (pq.isNotEmpty()) {
        result.append(pq.poll()).append("\n")
    }

    println(result)
}