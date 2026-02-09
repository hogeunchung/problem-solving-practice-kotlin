package leetcode

class Solution3300 {

    fun minElement(nums: IntArray): Int {
        return nums.minOf {
            var digitSum = 0
            var curr = it
            while (curr > 0) {
                digitSum += curr % 10
                curr /= 10
            }
            digitSum
        }
    }
}
