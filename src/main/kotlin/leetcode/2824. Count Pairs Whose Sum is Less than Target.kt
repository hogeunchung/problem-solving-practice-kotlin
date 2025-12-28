package leetcode

class Solution2824 {

    fun countPairs(nums: List<Int>, target: Int): Int {
        var result = 0
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] < target) {
                    result++
                }
            }
        }

        return result
    }
}
