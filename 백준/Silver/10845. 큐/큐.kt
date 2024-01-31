import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    val result = StringBuilder()

    repeat(n) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push" -> {
                val number = line[1].toInt()
                queue.offer(number)
            }

            "pop" -> {
                val number = if (queue.isEmpty()) -1 else queue.remove()
                result.append("$number\n")
            }

            "size" -> {
                val size = queue.size
                result.append("$size\n")
            }

            "empty" -> {
                val isEmpty = if (queue.isEmpty()) 1 else 0
                result.append("$isEmpty\n")
            }

            "front" -> {
                val front = if (queue.isEmpty()) -1 else queue.peek()
                result.append("$front\n")
            }

            "back" -> {
                val back = if (queue.isEmpty()) -1 else queue.last()
                result.append("$back\n")
            }
        }
    }

    println(result)
}