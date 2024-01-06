import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()

    while (true) {
        val list = br.readLine().split(" ").map { it.toInt() }.sorted()
        if (list[0] == 0) break
        val isRightTriangle = list[2] * list[2] == list[0] * list[0] + list[1] * list[1]

        if (isRightTriangle) result.append("right\n")
        else result.append("wrong\n")
    }
    
    println(result)
}