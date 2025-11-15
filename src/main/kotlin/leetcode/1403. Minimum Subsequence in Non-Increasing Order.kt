package leetcode

class Solution1403 {

    fun minSubsequence(nums: IntArray): List<Int> {
        val n = nums.size
        val totalSum = nums.sum()
        val descendingNums = nums.sortedDescending()

        var currSum = 0
        for (i in 0 until n) {
            currSum += descendingNums[i]
            if (currSum > totalSum - currSum) {
                return descendingNums.take(i + 1)
            }
        }

        return emptyList()
    }
}
