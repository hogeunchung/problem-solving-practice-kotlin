package leetcode

fun generate(numRows: Int): List<List<Int>> {
    val memo = List(numRows) { i -> MutableList(i + 1) { 0 } }
    memo[0][0] = 1

    for (i in 1 until numRows) {
        for (j in 0..i) {
            if (j == 0 || j == i) {
                memo[i][j] = 1
                continue
            }

            memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j]
        }
    }

    return memo
}
