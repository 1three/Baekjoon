fun main() = System.`in`.bufferedReader().use { br ->
    while (true) {
        val string = br.readLine() ?: break
        println(string)
    }
}