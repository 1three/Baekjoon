fun main() = System.`in`.bufferedReader().use { br ->
    var totalCredit = 0.0
    var totalGrade = 0.0

    for (i in 0 until 20) {
        val (name, credit, grade) = br.readLine().split(" ")

        if (grade != "P") {
            totalCredit += credit.toDouble()
            when (grade) {
                "A+" -> totalGrade += credit.toDouble() * 4.5
                "A0" -> totalGrade += credit.toDouble() * 4.0
                "B+" -> totalGrade += credit.toDouble() * 3.5
                "B0" -> totalGrade += credit.toDouble() * 3.0
                "C+" -> totalGrade += credit.toDouble() * 2.5
                "C0" -> totalGrade += credit.toDouble() * 2.0
                "D+" -> totalGrade += credit.toDouble() * 1.5
                "D0" -> totalGrade += credit.toDouble() * 1.0
                "F" -> totalGrade += credit.toDouble() * 0.0
            }
        }
    }

    val result = totalGrade / totalCredit
    println(result)
}