fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var m = br.readLine()
    
    for (i in 2 downTo 0) {
        val result = n * m[i].toString().toInt()
        println(result)
    }
    
    print(n * m.toInt())
}