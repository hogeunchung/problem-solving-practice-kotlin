package leetcode

class Solution3701 {

    fun alternatingSum(nums: IntArray): Int {
        var result = 0
        var sign = 1
        nums.forEach { num ->
            result += sign * num
            sign *= -1
        }

        return result
    }
}
