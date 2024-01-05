import java.util.LinkedList
import java.util.Queue

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    for (i in 1..n) {
        queue.add(i)
    }

    var flag = true
    while (queue.size > 1) {
        if (flag) {
            queue.poll()
            flag = false
        } else {
            val value = queue.poll()
            queue.add(value)
            flag = true
        }
    }

    println(queue.poll())
}
