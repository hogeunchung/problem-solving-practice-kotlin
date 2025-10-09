package leetcode

class Solution1128 {

    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val n = dominoes.size
        val dominoCountMatrix = Array(10) { Array(10) { 0 } }

        for (i in 0 until n) {
            if (dominoes[i][0] < dominoes[i][1]) {
                dominoCountMatrix[dominoes[i][0]][dominoes[i][1]]++
            } else {
                dominoCountMatrix[dominoes[i][1]][dominoes[i][0]]++
            }
        }

        var result = 0
        for (i in 1..9) {
            for (j in 1..9) {
                result += dominoCountMatrix[i][j] * (dominoCountMatrix[i][j] - 1) / 2
            }
        }

        return result
    }
}
