import java.lang.StringBuilder
import java.util.Deque
import java.util.LinkedList

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val deque: Deque<Int> = LinkedList()
    val result = StringBuilder()

    repeat(n) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push_front" -> {
                val number = line[1].toInt()
                deque.addFirst(number)
            }

            "push_back" -> {
                val number = line[1].toInt()
                deque.addLast(number)
            }

            "pop_front" -> {
                val number = if (deque.isEmpty()) -1 else deque.removeFirst()
                result.append("$number\n")
            }

            "pop_back" -> {
                val number = if (deque.isEmpty()) -1 else deque.removeLast()
                result.append("$number\n")
            }

            "size" -> {
                val size = deque.size
                result.append("$size\n")
            }

            "empty" -> {
                val isEmpty = if (deque.isEmpty()) 1 else 0
                result.append("$isEmpty\n")
            }
            
            "front" -> {
                val front = if (deque.isEmpty()) -1 else deque.first()
                result.append("$front\n")
            }

            "back" -> {
                val back = if (deque.isEmpty()) -1 else deque.last()
                result.append("$back\n")
            }
        }
    }

    println(result)
}