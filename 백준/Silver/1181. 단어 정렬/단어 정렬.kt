import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val result = StringBuilder()

    // 중복 제거
    val set = mutableSetOf<String>()
    repeat(n) {
        val word = br.readLine()
        set.add(word)
    }

    // 단어의 길이 → 알파벳 순서
    val sortedList = set.toList().sortedWith(compareBy({ it.length }, { it }))

    for (word in sortedList) {
        result.append("$word\n")
    }

    println(result)
}