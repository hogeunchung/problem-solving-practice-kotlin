package leetcode

fun isPowerOfFour(n: Int): Boolean {
    var curr = n
    if (curr <= 0) return false
    while (curr >= 1) {
        if (curr == 1) return true
        if (curr % 4 != 0) return false
        curr /= 4
    }
    return false
}
