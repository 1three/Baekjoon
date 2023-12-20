import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val coins = List(n) { br.readLine().toInt() }
    
    // 큰 수 순서대로 정렬
    val sortedCoins = coins.sortedDescending()
    
    // coinCnt : 결과, 동전 개수
    var coinCnt = 0
    var remain = k
    for (coin in sortedCoins) {
        if (remain >= coin) {
            coinCnt += remain / coin
            remain %= coin
        }
    }
    
    println(coinCnt)
    
    br.close()
}