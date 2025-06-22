package leetcode

fun uniquePaths(m: Int, n: Int): Int {
    val memo = IntArray(m * n) { 1 }
    for (mi in 1 until m) {
        for (ni in 1 until n) {
            memo[mi * n + ni] = memo[(mi - 1) * n + ni] + memo[mi * n + (ni - 1)]
        }
    }

    return memo[m * n - 1]
}
