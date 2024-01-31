import java.lang.StringBuilder
import java.util.Stack

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val result = StringBuilder()

    repeat(n) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push" -> {
                val number = line[1].toInt()
                stack.push(number)
            }

            "pop" -> {
                val number = if (stack.isEmpty()) -1 else stack.pop()
                result.append("$number\n")
            }

            "size" -> {
                val size = stack.size
                result.append("$size\n")
            }

            "empty" -> {
                val isEmpty = if (stack.isEmpty()) 1 else 0
                result.append("$isEmpty\n")
            }

            "top" -> {
                val top = if (stack.isEmpty()) -1 else stack.peek()
                result.append("$top\n")
            }
        }
    }

    println(result)
}