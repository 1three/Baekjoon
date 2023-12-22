import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val cards = PriorityQueue<Long>()
    repeat(n) {
        cards.add(br.readLine().toLong())
    }
    
    // 결과 : result, 카드 정렬한 횟수
    var result = 0L
    
    while (cards.size > 1) {
        val sum = cards.poll() + cards.poll()
        result += sum
        cards.add(sum)
    }
    
    println(result)
    
    br.close()
}