package leetcode

class Solution1572 {

    fun diagonalSum(mat: Array<IntArray>): Int {
        val n = mat.size
        var result = 0

        for (i in 0 until n) {
            result += mat[i][i] + mat[n - 1 - i][i]
        }
        if (n % 2 == 1) {
            result -= mat[n / 2][n / 2]
        }

        return result
    }
}
