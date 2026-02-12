package leetcode

class Solution2206 {

    fun divideArray(nums: IntArray): Boolean {
        val numCount = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            numCount[num] = numCount.getOrDefault(num, 0) + 1
        }

        return numCount.values.all { it % 2 == 0 }
    }
}
