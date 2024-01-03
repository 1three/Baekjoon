fun main() = System.`in`.bufferedReader().use { br ->
    val scales = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val asc = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val des = intArrayOf(8, 7, 6, 5, 4, 3, 2, 1)

    if (asc.contentEquals(scales)) println("ascending")
    else if (des.contentEquals(scales)) println("descending")
    else println("mixed")
}