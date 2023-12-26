fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuffer()
    while (true) {
        val string = br.readLine() ?: break
        result.append(string).append("\n")
    }
    print(result.toString())
}