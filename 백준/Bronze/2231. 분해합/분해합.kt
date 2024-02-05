fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val length = n.toString().length

    for (i in n - 9 * length..n) {
        if (getSum(i) + i == n) {
            println(i)
            return
        }
    }

    println(0)
}

fun getSum(num: Int): Int {
    var sum = 0
    var temp = num
    while (temp != 0) {
        sum += temp % 10
        temp /= 10
    }
    return sum
}