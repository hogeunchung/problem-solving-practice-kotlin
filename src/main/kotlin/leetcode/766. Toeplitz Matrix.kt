package leetcode

class Solution766 {

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val ySize = matrix.size
        val xSize = matrix[0].size

        for (y in 0 until ySize) {
            for (x in 0 until xSize) {
                val curr = matrix[y][x]
                var d = 1
                while (y + d < ySize && x + d < xSize) {
                    if (curr != matrix[y + d][x + d]) return false
                    d++
                }
            }
        }

        return true
    }
}
