fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var result = 0

    repeat(n) {
        val word = br.readLine()
        val set = mutableSetOf<Char>()
        var previousChar = ' '
        var isGroupWord = true

        for (char in word) {
            if (set.contains(char) && previousChar != char) { // set에 있을 경우 && 이전 알파벳과 다른 경우
                isGroupWord = false
                break
            } else { // set에 없을 경우
                set.add(char)
                previousChar = char
                isGroupWord = true
            }
        }

        if (isGroupWord) {
            result += 1
        }
    }

    println(result)
}