package leetcode

class Solution2176 {

    fun countPairs(nums: IntArray, k: Int): Int {
        val n = nums.size
        var count = 0

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    count++
                }
            }
        }

        return count
    }
}
