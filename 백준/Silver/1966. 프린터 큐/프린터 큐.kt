import java.lang.StringBuilder
import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

data class Document(val important: Int, val index: Int)

fun main() = System.`in`.bufferedReader().use { br ->
    val t = br.readLine().toInt()
    val result = StringBuilder()

    repeat(t) {
        val (_, m) = br.readLine().split(" ").map { it.toInt() }
        val queue: Queue<Document> = LinkedList()
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        br.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, important ->
            queue.offer(Document(important, index))
            pq.offer(important)
        }

        var count = 0
        while (queue.isNotEmpty()) {
            val current = queue.poll()
            if (current.important == pq.peek()) {
                pq.poll()
                count++

                if (current.index == m) {
                    result.append(count).append("\n")
                    break
                }
            } else {
                queue.offer(current)
            }
        }
    }
    
    println(result)
}