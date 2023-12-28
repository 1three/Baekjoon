import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()
    val array = Array(5) { CharArray(15) { '\u0000' } }

    for (i in 0 until 5) {
        val string = br.readLine().toCharArray()
        for (j in string.indices) {
            array[i][j] = string[j]
        }
    }

    // 행
    for (i in 0 until 15) {
        // 열
        for (j in 0 until 5) {
            if (i < array[j].size) {
                val char = array[j][i]
                if (char != '\u0000') {
                    result.append(char)
                }
            }
        }
    }

    print(result)
}