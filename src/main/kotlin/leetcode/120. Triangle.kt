package leetcode

fun minimumTotal(triangle: List<List<Int>>): Int {
    val n = triangle.size
    val memo = Array(n) { IntArray(n) { Int.MAX_VALUE } }
    memo[0][0] = triangle[0][0]

    for (i in 1 until n) {
        for (j in 0 until i + 1) {
            memo[i][j] = triangle[i][j]
            memo[i][j] += if (j > 0 && memo[i - 1][j - 1] < memo[i - 1][j]) {
                memo[i - 1][j - 1]
            } else {
                memo[i - 1][j]
            }
        }
    }

    var minPathSum = Int.MAX_VALUE
    for (j in 0 until n) {
        if (minPathSum > memo[n - 1][j]) {
            minPathSum = memo[n - 1][j]
        }
    }

    return minPathSum
}
