import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue

fun main() = System.`in`.bufferedReader().use { br ->
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList(MutableList(n) { it + 1 })
    val result = StringBuilder("<")

    while (queue.size > 1) {
        for (i in 0 until k - 1) {
            queue.offer(queue.poll())
        }
        result.append("${queue.poll()}, ")
    }

    result.append("${queue.poll()}>")
    println(result.toString())
}