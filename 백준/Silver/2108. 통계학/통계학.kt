import kotlin.math.roundToInt

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    var sum = 0
    val numbersArray = mutableListOf<Int>()
    val numbersMap = mutableMapOf<Int, Int>()
    var max = -4000
    var min = 4000

    repeat(n) {
        val num = br.readLine().toInt()

        // 평균 계산
        sum += num

        // 중앙값
        numbersArray.add(num)

        // 최빈값
        numbersMap[num] = numbersMap.getOrDefault(num, 0) + 1

        // 범위 (최대 최소 값 차이)
        if (max < num) max = num
        if (min > num) min = num
    }

    // 평균
    val avg = (sum * 1.0 / n).roundToInt()
    println(avg)

    // 중앙값
    val sortedArray = numbersArray.sorted()
    val center = sortedArray[n / 2]
    println(center)

    // 최빈값
    val maxFrequency = numbersMap.values.maxOrNull()
    val frequencyNumbers = numbersMap.filterValues { it == maxFrequency }.keys
    val frequencyNumber = if  (frequencyNumbers.size > 1) frequencyNumbers.sorted()[1] else frequencyNumbers.first()
    println(frequencyNumber)

    // 범위 (최대 최소 값 차이)
    val range = max - min
    println(range)
}
