package leetcode

class Solution3065 {

    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.count { it < k }
    }
}
