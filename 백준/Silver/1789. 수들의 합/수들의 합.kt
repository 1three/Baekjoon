import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))    
    val s = br.readLine().toLong()

    // 조건식
    // n * (n+1) / 2 <= s인 n
    
    val standard = s * 2
    var n = Math.sqrt(standard.toDouble()).toLong()
    
    while (true) {
        val multiply = n * (n + 1)
        if (multiply <= standard) {
            break
        }
        n--
    }
    
    println(n)
    br.close()
}