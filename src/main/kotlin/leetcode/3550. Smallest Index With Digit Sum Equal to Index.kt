package leetcode

class Solution3550 {

    fun smallestIndex(nums: IntArray): Int {
        nums.forEachIndexed { i, num ->
            var digitSum = 0
            var curr = num
            while (curr > 0) {
                digitSum += curr % 10
                curr /= 10
            }

            if (i == digitSum) return i
        }

        return -1
    }
}
