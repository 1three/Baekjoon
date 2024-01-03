fun main() = System.`in`.bufferedReader().use { br ->
    val scales = br.readLine()
    val asc = "1 2 3 4 5 6 7 8"
    val des = "8 7 6 5 4 3 2 1"

    when (scales) {
        asc -> println("ascending")
        des -> println("descending")
        else -> println("mixed")
    }
}