import java.lang.StringBuilder
import java.util.Stack

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val result = StringBuilder()

    repeat(n) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push" -> stack.push(line[1].toInt())
            "pop" -> result.append("${if (stack.isEmpty()) -1 else stack.pop()}\n")
            "size" -> result.append("${stack.size}\n")
            "empty" -> result.append("${if (stack.isEmpty()) 1 else 0}\n")
            "top" -> result.append("${if (stack.isEmpty()) -1 else stack.peek()}\n")
        }
    }

    println(result)
}