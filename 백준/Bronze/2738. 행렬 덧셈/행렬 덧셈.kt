fun main() = System.`in`.bufferedReader().use { br ->
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val result = StringBuilder()
    val array = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        array[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            array[i][j] += row[j]
        }
    }

    array.forEach { row ->
        result.append(row.joinToString(" ")).append("\n")
    }
    println(result)
}