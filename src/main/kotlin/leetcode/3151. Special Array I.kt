package leetcode

class Solution3151 {

    fun isArraySpecial(nums: IntArray): Boolean {
        var lastParity = nums[0] % 2
        for (i in 1 until nums.size) {
            if (nums[i] % 2 == lastParity) return false
            lastParity = 1 - lastParity
        }

        return true
    }
}
