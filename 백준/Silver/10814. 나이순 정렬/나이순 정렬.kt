fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val array = Array(201) { StringBuilder() }
    val result = StringBuilder()

    repeat(n) {
        val string = br.readLine()
        val (age, _) = string.split(" ")

        array[age.toInt()].append("$string\n")
    }

    array.forEach { result.append(it) }
    println(result)
}