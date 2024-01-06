import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val list = BooleanArray(2_000_001)
    val result = StringBuilder()

    repeat(n) {
        val m = br.readLine().toInt()
        list[m + 1_000_000] = true
    }

    for (i in list.indices) {
        if (list[i]) {
            result.append(i-1_000_000).append("\n")
        }
    }

    println(result)
}