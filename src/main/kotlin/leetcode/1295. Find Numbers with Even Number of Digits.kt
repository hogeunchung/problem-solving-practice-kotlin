package leetcode

class Solution1295 {

    fun findNumbers(nums: IntArray): Int {
        return nums.count { num ->
            var curr = num
            while (curr > 0) {
                if (curr < 10) return@count false
                curr /= 100
            }

            return@count true
        }
    }
}
