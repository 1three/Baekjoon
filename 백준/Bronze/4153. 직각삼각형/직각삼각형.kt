fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()
    
    while (true) {
        val list = br.readLine().split(" ").map { it.toInt() }
        if (list[0] == 0) break
        when {
            list[2] * list[2] == list[0] * list[0] + list[1] * list[1] -> result.append("right\n")
            list[1] * list[1] == list[0] * list[0] + list[2] * list[2] -> result.append("right\n")
            list[0] * list[0] == list[1] * list[1] + list[2] * list[2] -> result.append("right\n")
            else -> result.append("wrong\n")
        }
    }

    println(result)
}