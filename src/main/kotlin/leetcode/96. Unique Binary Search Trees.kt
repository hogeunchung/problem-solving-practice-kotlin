package leetcode

fun numTrees(n: Int): Int {
    val memo = IntArray(n + 1)
    memo[0] = 1
    for (i in 1 until n + 1) {
        for (j in 0 until i) {
            memo[i] += memo[j] * memo[i - 1 - j]
        }
    }

    return memo[n]
}
