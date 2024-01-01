fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var endNumber = 666
    var endNumberIndex = 1

    while (endNumberIndex < n) {
        endNumber++
        if (endNumber.toString().contains("666")) endNumberIndex++
    }

    println(endNumber)
}