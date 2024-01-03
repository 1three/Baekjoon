import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val s = br.readLine()
    var array = IntArray(26) { -1 }
    
    for (i in s.indices.reversed()) {
        for (j in 97..122) {
            if(s[i] == j.toChar()) {
                array[j - 97] = i
            }
        }
    }
    
    array.forEach { print("$it ") }
}