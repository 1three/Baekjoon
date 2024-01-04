import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue

data class Document(val important: Int, val index: Int)

fun main() = System.`in`.bufferedReader().use { br ->
    val t = br.readLine().toInt()
    val result = StringBuilder()

    repeat(t) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val important = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        // 큐 초기화
        val queue: Queue<Document> = LinkedList<Document>()
        // 뽑은 순서를 담을 리스트
        val order = mutableListOf<Int>()

        // 큐에 문서 추가
        for (i in 0 until n) {
            queue.offer(Document(important[i], i))
        }

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            if (current.important == important.max()) {
                order.add(current.index)
                important.remove(current.important)
            } else {
                queue.offer(current)
            }
        }

        result.append(order.indexOf(m) + 1).append("\n")
    }

    println(result)
}