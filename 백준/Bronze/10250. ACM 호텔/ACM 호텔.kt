import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val t = br.readLine().toInt()
    val result = StringBuilder(t * 4)  // 고정된 출력 길이 가정, 초기 크기 설정

    repeat(t) {
        val (h, _, n) = br.readLine().split(" ").map { it.toInt() }

        val no = (n - 1) / h + 1
        val floor = (n - 1) % h + 1

        result.append(floor * 100 + no).append("\n")
    }

    println(result)
}