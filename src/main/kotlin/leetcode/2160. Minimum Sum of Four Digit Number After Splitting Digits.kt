package leetcode

fun minimumSum(num: Int): Int {
    val digits = intArrayOf(num / 1000, num / 100, num / 10, num)
        .map { it % 10 }
        .sorted()
    return (digits[0] + digits[1]) * 10 + (digits[2] + digits[3])
}
