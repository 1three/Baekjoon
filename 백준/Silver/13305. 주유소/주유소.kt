import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.io.StringReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))    
    
    val n = br.readLine().toInt()
    
   	val roadLengths = IntArray(n - 1)
    val roadTokens = StringTokenizer(br.readLine())
    for (i in 0 until n - 1) {
        roadLengths[i] = roadTokens.nextToken().toInt()
    }

    val gasPrices = IntArray(n)
    val gasTokens = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        gasPrices[i] = gasTokens.nextToken().toInt()
    }
    
    // result : 결과 담는 변수
    var result = 0
    
    val cityNumber = gasPrices.size
    
    var i = 0
    
    while (i < cityNumber - 1) {
        // 비용 (내 도시의 기름 비용)
        val expense = gasPrices[i]
        
        // 가장 가까우면서, 내 도시보다 기름이 저렴한 도시 찾기
        var minCity = i
        for (j in i + 1 until cityNumber - 1) {
            if (expense > gasPrices[j]) {
                minCity = j
                break
            } else {
                continue
            }
        }
        
        // 거리 (minCity까지의 거리)
        var distance = 0
        
        if (minCity == i) {
            // 내 도시의 기름이 가장 저렴한 경우
            for (k in i until cityNumber - 1){
                distance += roadLengths[k]
            }
            result += distance * expense
            println(result)
            return
        } else {
            // 나보다 저렴한 도시가 있는 경우
            for (l in i until minCity) {
                distance += roadLengths[l]
            }
            result += distance * expense
            i = minCity
            continue
        }
    }
    
    println(result)
    
    br.close()
}