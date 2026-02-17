package leetcode

import kotlin.math.max

class Solution2016 {

    fun maximumDifference(nums: IntArray): Int {
        val sortedIndexValuePairs = nums
            .mapIndexed { index, i -> index to i }
            .sortedBy { it.second }
        val memo = mutableMapOf<Pair<Int, Int>, Int>()

        return calcMaxDiff(sortedIndexValuePairs = sortedIndexValuePairs, i = 0, j = nums.size - 1, memo = memo)
    }

    private fun calcMaxDiff(
        sortedIndexValuePairs: List<Pair<Int, Int>>,
        i: Int,
        j: Int,
        memo: MutableMap<Pair<Int, Int>, Int>,
    ): Int {
        if (i >= j) return -1
        if (memo[i to j] != null) return memo[i to j]!!
        if (sortedIndexValuePairs[j].second == sortedIndexValuePairs[i].second) return -1
        if (sortedIndexValuePairs[i].first < sortedIndexValuePairs[j].first) {
            return sortedIndexValuePairs[j].second - sortedIndexValuePairs[i].second
        }

        val maxDiff = max(
            calcMaxDiff(sortedIndexValuePairs = sortedIndexValuePairs, i = i + 1, j = j, memo = memo),
            calcMaxDiff(sortedIndexValuePairs = sortedIndexValuePairs, i = i, j = j - 1, memo = memo),
        )
        memo[i to j] = maxDiff

        return maxDiff
    }
}
