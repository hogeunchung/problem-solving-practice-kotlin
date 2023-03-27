package leetcode

fun addDigits(num: Int): Int {
    var curr = num
    while (curr >= 10) {
        curr = addDigitsHelper(curr)
    }
    return curr
}

fun addDigitsHelper(num: Int): Int {
    var curr = num
    var result = 0
    while (curr > 0) {
        result += curr % 10
        curr /= 10
    }
    return result
}

