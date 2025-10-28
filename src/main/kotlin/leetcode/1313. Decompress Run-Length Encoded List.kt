package leetcode

class Solution1313 {

    fun decompressRLElist(nums: IntArray): IntArray {
        val decompressed = mutableListOf<Int>()

        for (i in 0 until nums.size / 2) {
            repeat(nums[2 * i]) {
                decompressed.add(nums[2 * i + 1])
            }
        }

        return decompressed.toIntArray()
    }
}
