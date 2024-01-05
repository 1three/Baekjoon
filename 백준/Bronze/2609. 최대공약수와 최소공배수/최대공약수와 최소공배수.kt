import kotlin.math.sqrt

fun main() = System.`in`.bufferedReader().use { br ->
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val maxDivisor = findDivisor(n).intersect(findDivisor(m)).max()
    val minMultiple = (n / maxDivisor) * (m / maxDivisor) * maxDivisor

    println("$maxDivisor\n$minMultiple")
}

fun findDivisor(n: Int): MutableSet<Int> {
    var divisors = mutableSetOf<Int>()
    for (i in 1..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            divisors.add(i)
            divisors.add(n / i)
        }
    }
    return divisors
}
