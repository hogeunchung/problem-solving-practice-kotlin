package leetcode

fun hammingWeight(n: Int): Int {
    var curr = n
    var count = 0
    for (i in 0 until 32) {
        if (curr.and(1) == 1) count++
        curr = curr.shr(1)
    }
    return count
}
