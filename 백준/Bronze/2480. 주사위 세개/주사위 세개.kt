fun main() = System.`in`.bufferedReader().use { br ->
    val dice = br.readLine().split(" ").map { it.toInt() }.sorted()

    val prize = when {
        dice[0] == dice[2] -> 10_000 + dice[0] * 1_000
        dice[0] == dice[1] || dice[1] == dice[2] -> 1_000 + dice[1] * 100
        else -> dice[2] * 100
    }

    println(prize)
}