data class Person (
    val weight: Int,
    val height: Int
)

fun main() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    val persons = arrayListOf<Person>()
    val result = StringBuilder()

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        persons.add(Person(x, y))
    }

    for (i in 0 until n) {
        val personH = persons[i].height
        val personW = persons[i].weight
        var rank = 1

        for (j in 0 until n) {
            if (i == j) continue
            val otherH = persons[j].height
            val otherW = persons[j].weight
            if (otherH > personH && otherW > personW) rank++
        }
        result.append(rank).append(" ")
    }
    
    println(result)
}