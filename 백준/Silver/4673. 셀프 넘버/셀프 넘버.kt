fun main() {
    var isSelfNumber = BooleanArray(10000) { true }
    val result = StringBuilder()
    
    for (i in 1 until 10000) {
        var num = i
        var sum = i
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        if (sum < 10000) {
            isSelfNumber[sum] = false
        }
    }
    
    for (i in 1 until 10000) {
        if (isSelfNumber[i]) {
            result.append("$i\n")
        }
    }
    print(result)
}