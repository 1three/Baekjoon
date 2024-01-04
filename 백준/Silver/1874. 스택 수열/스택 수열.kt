import java.lang.StringBuilder
import java.util.Stack

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val result = StringBuilder()
    var current = 1 // 스택에 push 할 숫자

    repeat(n) {
        val input = br.readLine().toInt()

        while (current <= input) {
            stack.push(current++)
            result.append("+\n")
        }

        if (stack.isNotEmpty() && stack.peek() == input) {
            stack.pop()
            result.append("-\n")
        } else {
            println("NO")
            return
        }
    }

    println(result)
}