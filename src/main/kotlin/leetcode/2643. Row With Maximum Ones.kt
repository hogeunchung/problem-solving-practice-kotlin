package leetcode

class Solution2643 {

    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        val rowWithMaxOnes = mat
            .map { arr -> arr.count { num -> num == 1 } }
            .mapIndexed { i, num -> i to num }
            .maxByOrNull { (_, num) -> num }!!

        return intArrayOf(rowWithMaxOnes.first, rowWithMaxOnes.second)
    }
}
