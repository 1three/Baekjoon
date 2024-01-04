import java.lang.StringBuilder

fun main() = System.`in`.bufferedReader().use { br ->
    val result = StringBuilder()
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()

    val m = br.readLine().toInt()
    val targetArray = br.readLine().split(" ").map { it.toInt() }

    for (target in targetArray) {
        var left = 0
        var right = array.size - 1
        var isFind = false

        while(left <= right) {
            val mid = (left + right) / 2

            when {
                array[mid] < target -> left = mid + 1
                array[mid] > target -> right = mid - 1
                else -> {
                    result.append("1\n")
                    isFind = true
                    break
                }
            }
        }
        if (!isFind) result.append("0\n")
    }

    println(result)
}