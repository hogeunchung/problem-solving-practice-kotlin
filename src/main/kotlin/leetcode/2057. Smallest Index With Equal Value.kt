package leetcode

class Solution2057 {

    fun smallestEqual(nums: IntArray): Int {
        for (i in 0 until nums.size) {
            if (i % 10 == nums[i]) return i
        }
        return -1
    }
}
