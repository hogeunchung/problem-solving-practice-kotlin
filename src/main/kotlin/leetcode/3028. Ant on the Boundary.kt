package leetcode

class Solution3028 {

    fun returnToBoundaryCount(nums: IntArray): Int {
        var sum = 0
        var count = 0
        nums.forEach { num ->
            sum += num
            if (sum == 0) count++
        }

        return count
    }
}
