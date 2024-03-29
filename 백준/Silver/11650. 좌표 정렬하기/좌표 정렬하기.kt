import java.lang.StringBuilder
import java.util.PriorityQueue

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return when {
            this.x != other.x -> this.x - other.x
            else -> this.y - other.y
        }
    }
}

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Point>()
    val result = StringBuilder()
    
    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        pq.offer(Point(x, y))
    }

    while (pq.isNotEmpty()) {
        val point = pq.poll()
        result.append("${point.x} ${point.y}\n")
    }
    
    println(result)
}