import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val cards = StringTokenizer(br.readLine())
    val m = br.readLine().toInt()
    val numbers = StringTokenizer(br.readLine())

    val map = HashMap<Int, Int>()
    val result = StringBuilder()

    repeat(n) {
        val key = cards.nextToken().toInt()
        map[key] = map.getOrDefault(key, 0) + 1
    }

    repeat(m) {
        val key = numbers.nextToken().toInt()
        val count = map.getOrDefault(key, 0)
        result.append("$count ")
    }

    println(result)
}