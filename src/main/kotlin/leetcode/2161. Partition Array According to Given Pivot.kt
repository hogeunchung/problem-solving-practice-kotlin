package leetcode

class Solution2161 {

    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val n = nums.size
        val smaller = mutableListOf<Int>()
        val larger = mutableListOf<Int>()

        for (i in 0 until n) {
            if (nums[i] < pivot) {
                smaller.add(nums[i])
            } else if (nums[i] > pivot) {
                larger.add(nums[i])
            }
        }

        val pivotCount = n - smaller.size - larger.size
        return (smaller + (1..pivotCount).map { pivot } + larger).toIntArray()
    }
}
