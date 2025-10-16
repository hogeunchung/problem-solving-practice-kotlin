package leetcode

class Solution3289 {

    fun getSneakyNumbers(nums: IntArray): IntArray {
        return nums
            .groupBy { it }
            .filter { it.value.size > 1 }
            .keys
            .toIntArray()
    }
}
