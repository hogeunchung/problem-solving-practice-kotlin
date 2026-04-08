package leetcode

class Solution1252 {

    fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {
        val matrix = Array(m) { IntArray(n) }
        indices.forEach {
            for (ni in 0 until n) matrix[it[0]][ni]++
            for (mi in 0 until m) matrix[mi][it[1]]++
        }

        var result = 0
        for (mi in 0 until m) {
            for (ni in 0 until n) {
                if (matrix[mi][ni] % 2 == 1) result++
            }
        }

        return result
    }
}
