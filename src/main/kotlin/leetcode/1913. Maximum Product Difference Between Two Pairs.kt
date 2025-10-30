package leetcode

class Solution1913 {

    fun maxProductDifference(nums: IntArray): Int {
        val n = nums.size
        val sortedNums = nums.sorted()

        return sortedNums[n - 1] * sortedNums[n - 2] - sortedNums[0] * sortedNums[1]
    }
}
