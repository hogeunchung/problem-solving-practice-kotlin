package leetcode

fun findComplement(num: Int): Int {
    var curr = num
    var level = 0
    var result = 0
    while (curr > 0) {
        result += (1 - curr % 2) * 1.shl(level)
        curr /= 2
        level++
    }

    return result
}
