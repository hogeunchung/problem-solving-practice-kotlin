package leetcode

import kotlin.math.sqrt

fun checkPerfectNumber(num: Int): Boolean {
    var sum = 1
    val sqrt = sqrt(num.toDouble()).toInt()

    for (divisor in 2 until sqrt) {
        if (num % divisor == 0) {
            sum += divisor
            sum += num / divisor
        }
    }
    if (num % sqrt == 0) {
        sum += sqrt
        if (num / sqrt != sqrt) {
            sum += num / sqrt
        }
    }

    return sum == num
}
