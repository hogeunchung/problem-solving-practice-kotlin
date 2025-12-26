package leetcode

class Solution1437 {

    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var lastKIdx = -100000

        for (i in 0 until nums.size) {
            if (nums[i] == 1) {
                if (i - lastKIdx <= k) {
                    return false
                }

                lastKIdx = i
            }
        }

        return true
    }
}
