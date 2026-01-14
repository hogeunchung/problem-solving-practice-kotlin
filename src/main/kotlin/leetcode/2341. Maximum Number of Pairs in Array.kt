package leetcode

class Solution2341 {

    fun numberOfPairs(nums: IntArray): IntArray {
        val numCounts = nums
            .groupBy { it }
            .map { it.value.size }

        var pairCount = 0
        var remainingCount = 0
        numCounts.forEach { numCount ->
            pairCount += numCount / 2
            remainingCount += numCount % 2
        }

        return intArrayOf(pairCount, remainingCount)
    }
}
