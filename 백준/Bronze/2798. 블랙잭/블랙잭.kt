fun main() = System.`in`.bufferedReader().use { br ->
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val list = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    // m과 가장 차이가 적은 값 (m - sum, 0에 가까울 수록 차이가 적은 값)
    var minDiff = 300_000
    var result = 0

    // 부분 집합의 첫 번째 값 : i
    for (i in 0..<n - 2) {
        val iNum = list[i]

        // 부분 집합의 두 번째 값 : J
        for (j in i + 1..<n - 1) {
            val jNum = list[j]

            // 부분 집합의 세 번째 값 : k
            for (k in j + 1..<n) {
                val kNum = list[k]

                val sum = iNum + jNum + kNum
                val diff = m - sum

                if (diff in 0..<minDiff) {
                    minDiff = diff
                    result = sum
                }
            }
        }
    }

    println(result)
}