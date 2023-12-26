import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val result = StringBuilder()
    
    val sum = a + b
    val sub = a - b
    val mul = a * b
    val div = a / b
    val rem = a % b
    
    result.apply {
        append("$sum\n")
        append("$sub\n")
        append("$mul\n")
        append("$div\n")
        append("$rem")
    }
    
    println(result)
    
    br.close()
}