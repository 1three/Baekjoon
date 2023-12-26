fun main() = System.`in`.bufferedReader().use { br ->
    val (h, m) = br.readLine().split(" ").map { it.toInt() }
    val newH: Int
    val newM: Int
    
    if (m < 45) {
        newH = if (h > 0) h - 1 else 23
        newM = 60 - (45 - m)
    } else {
    	newH = h
        newM = m - 45
    }
    
    println("$newH $newM")
}