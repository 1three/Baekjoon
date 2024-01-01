fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()

    var count = 0
    var i = 5
    while (n >= i) {
        count += n / i
        i *= 5
    }
    println(count)
}