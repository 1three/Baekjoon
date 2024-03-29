/**
 *
 * 1        : 1     = 1
 * 2 - 7    : 6     = 2
 * 8 - 19   : 12    = 3
 * 20 - 37  : 18    = 4
 * 38 - 61  : 24    = 5
 * */

/**
 *   1 + 6 + 12 + 18 + 24 + ... + 6 * n
 * = 1 + 6 * (1 + 2 + 3 + ... + n)
 * = 1 + 6 * n * (n + 1) / 2
 * = 1 + 3 * n * (n + 1)
 *
 * 13 = 1 + 6 * n * (n + 1) / 2
 * 12 = 6 * n * (n + 1) / 2
 * 2 = n * (n + 1) / 2
 * 4 = n * (n + 1)
 * 4 < n * (n + 1) ... n = 2
 * 정답은 2 + 1 = 3
 *
 * 58 = 1 + 6 * n * (n + 1) / 2
 * 57 < 6 * n * (n + 1) / 2
 * n = 4
 * 정답은 4 + 1 = 5
 * */

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var layer = 1

    while (n > 1 + 3 * layer * (layer - 1)) {
        layer++
    }

    println(layer)
}
