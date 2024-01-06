fun main() = System.`in`.bufferedReader().use { br ->
    while (true) {
        val list = br.readLine().split(" ").map { it.toInt() }
        if (list[0] == 0) break
        when {
            list[2] * list[2] == list[0] * list[0] + list[1] * list[1] -> println("right")
            list[1] * list[1] == list[0] * list[0] + list[2] * list[2] -> println("right")
            list[0] * list[0] == list[1] * list[1] + list[2] * list[2] -> println("right")
            else -> println("wrong")
        }
    }
}