package leetcode

class Solution1636 {

    fun frequencySort(nums: IntArray): IntArray {
        return nums
            .groupBy { it }
            .toList()
            .sortedByDescending { it.first }
            .sortedBy { it.second.count() }
            .flatMap { it.second }
            .toIntArray()
    }
}
