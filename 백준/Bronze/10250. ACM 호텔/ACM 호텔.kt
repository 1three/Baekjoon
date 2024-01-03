import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val t = br.readLine().toInt()
    val result = StringBuilder()

    repeat(t) {
        val (h, _, n) = br.readLine().split(" ").map { it.toInt() }
        var floor = 0
        var no = 0

        if (n % h == 0) {
            floor = h
            no = n / h
        } else {
            floor = n % h
            no = n / h + 1
        }

        result.append(floor * 100 + no).append("\n")
    }

    println(result)
}