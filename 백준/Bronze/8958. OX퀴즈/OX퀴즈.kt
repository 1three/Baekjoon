import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val result = StringBuilder()

    repeat(n) {
        val string = br.readLine()
        var score = 0
        var beforeScore = 0

        for (char in string) {
            if (char == 'O') {
                beforeScore++
                score += beforeScore
            } else {
                beforeScore = 0
            }
        }
        result.append("$score\n")
    }

    println(result)
}