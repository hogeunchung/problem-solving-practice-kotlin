package leetcode

import kotlin.math.abs

class Solution2535 {

    fun differenceOfSum(nums: IntArray): Int {
        val arrayElemSum = nums.sum()
        val arrayDigitSum = nums.sumOf { num ->
            var digitSum = 0
            var curr = num
            while (curr > 0) {
                digitSum += curr % 10
                curr /= 10
            }
            digitSum
        }

        return abs(arrayElemSum - arrayDigitSum)
    }
}
