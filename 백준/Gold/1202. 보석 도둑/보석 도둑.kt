import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

data class Jewel(val weight: Int, val price: Int) : Comparable<Jewel> {
    override fun compareTo(other: Jewel) = other.price.compareTo(price)
}

fun main() {
     val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val jewels = mutableListOf<Jewel>()
    val bags = mutableListOf<Int>()
    val jewelsPriorityQueue = PriorityQueue<Jewel>()
    
    repeat(n) {
        val (weight, price) = br.readLine().split(" ").map { it.toInt() }
        jewels.add(Jewel(weight, price))
    }
    
    repeat(k) {
        val capacity = br.readLine().toInt()
        bags.add(capacity)
    }
    
    jewels.sortBy { it.weight } // 무게 작은 순으로 보석 저장
    bags.sort() // 용량 작은 순으로 가방 저장
	
    var jewelsIdx = 0
    var result: Long = 0
    
    for (i in 0 until k) {
        while (jewelsIdx < n && jewels[jewelsIdx].weight <= bags[i]) {
            jewelsPriorityQueue.add(jewels[jewelsIdx++])
        }
        if (jewelsPriorityQueue.isNotEmpty()) {
            result += jewelsPriorityQueue.poll().price
        }
    }
    
    println(result)
    
    br.close()
}