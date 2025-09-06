package leetcode

fun checkPerfectNumber(num: Int): Boolean {
    var sum = 0
    for (divisor in num / 2 downTo 1) {
        if (num % divisor == 0) {
            sum += divisor

            if (sum > num) {
                return false
            }
        }
    }

    return sum == num
}
