import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))    
    
    val n = br.readLine().toLong()
    
    val roadLengths = br.readLine().split(" ").map { it.toLong() }.toLongArray()
    val gasPrices = br.readLine().split(" ").map { it.toLong() }.toLongArray()
    
    // result : 결과 담는 변수
    var result = 0L
    
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
        var distance = 0L
        
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
    
    br.close()
}