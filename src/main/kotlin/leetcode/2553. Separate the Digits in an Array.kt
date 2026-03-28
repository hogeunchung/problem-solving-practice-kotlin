package leetcode

class Solution2553 {

    fun separateDigits(nums: IntArray): IntArray {
        val reversedNums = mutableListOf<Int>()
        for (i in nums.size - 1 downTo 0) {
            var curr = nums[i]
            while (curr > 0) {
                reversedNums.add(curr % 10)
                curr /= 10
            }
        }

        return reversedNums.reversed().toIntArray()
    }
}
