package leetcode

fun countBits(n: Int): IntArray {
    if (n == 0) return intArrayOf(0)
    if (n == 1) return intArrayOf(0, 1)

    val memo = IntArray(n + 1)
    memo[1] = 1

    for (i in 2..n) {
        if (i % 2 == 0) memo[i] = memo[i / 2]
        else memo[i] = memo[i / 2] + 1
    }

    return memo
}
