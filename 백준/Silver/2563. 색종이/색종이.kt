fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val paper = Array(100) { IntArray(100) }
    var area = 0

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        for (i in x until x + 10 ) {
            for (j in y until y + 10) {
                paper[i][j] = 1
            }
        }
    }

    // paper.forEach { row ->
    //     println(row.joinToString(" "))
    // }

    for (row in paper) {
        for (cell in row) {
            if (cell == 1) area++
        }
    }
    println(area) // 결과 출력
}