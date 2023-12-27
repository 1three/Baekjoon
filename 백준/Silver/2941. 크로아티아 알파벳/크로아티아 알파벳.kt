fun main() = System.`in`.bufferedReader().use { br ->
    var word = br.readLine()
    val croatiaArray = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var result = 0

    for (croatia in croatiaArray) {
        while (true) {
            val isFind = word.indexOf(croatia)
            if (isFind == -1) break
            word = word.replace(croatia, " ")

        }
    }

    result = word.length
    println(result)
}