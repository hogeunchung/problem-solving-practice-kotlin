package leetcode

fun getRow(rowIndex: Int): List<Int> {
    val memo = Array(rowIndex + 1) { IntArray(rowIndex + 1) { 1 } }
    for (i in 1..rowIndex)
        for (j in 1 until i)
            memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j]

    return memo[rowIndex].toList()
}
