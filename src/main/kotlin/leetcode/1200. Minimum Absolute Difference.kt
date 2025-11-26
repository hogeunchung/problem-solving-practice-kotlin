package leetcode

import kotlin.math.abs

class Solution1200 {

    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        val n = arr.size
        val sortedArr = arr.sorted()
        var minDiff = Int.MAX_VALUE
        val pairsWithMinDiff = mutableSetOf<Pair<Int, Int>>()

        for (i in 0 until n - 1) {
            val diff = abs(sortedArr[i] - sortedArr[i + 1])
            if (minDiff < diff) continue
            else if (diff < minDiff) {
                minDiff = diff
                pairsWithMinDiff.clear()
            }

            val pair = if (sortedArr[i] < sortedArr[i + 1]) {
                sortedArr[i] to sortedArr[i + 1]
            } else {
                sortedArr[i + 1] to sortedArr[i]
            }
            pairsWithMinDiff.add(pair)
        }

        return pairsWithMinDiff
            .sortedBy { it.second }
            .sortedBy { it.first }
            .map { listOf(it.first, it.second) }
    }
}
