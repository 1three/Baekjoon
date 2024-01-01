import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()

    while (true) {
        val string = br.readLine()
        if (string == "0") break

        var isPalin = true
        val lastN = string.length - 1
        val halfN = string.length / 2
        for (i in 0 until halfN) {
            if (string[i] != string[lastN - i]) isPalin = false
        }

        if (isPalin) result.append("yes").append("\n")
        else result.append("no").append("\n")
    }

    println(result)
}