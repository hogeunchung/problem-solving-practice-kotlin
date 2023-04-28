package leetcode

fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    return (left..right).filter { isSelfDividingNumber(it) }
}

private fun isSelfDividingNumber(num: Int): Boolean {
    if (num % 10 == 0) return false

    var curr = num
    while (curr > 0) {
        val divider = curr % 10

        if (divider == 0) return false
        if (num % divider != 0) return false

        curr /= 10
    }
    return true
}
