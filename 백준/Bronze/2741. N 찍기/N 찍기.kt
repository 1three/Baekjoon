import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val result = StringBuilder()

    for (i in 1..n) {
        result.append(i).append("\n")
    }

    println(result)
}