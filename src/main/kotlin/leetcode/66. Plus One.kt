package leetcode

fun plusOne(digits: IntArray): IntArray {
    var cast = 1
    for (i in digits.size - 1 downTo 0) {
        val sum = digits[i] + cast
        cast = sum / 10
        digits[i] = sum % 10
    }

    return IntArray(cast) { 1 } + digits
}
