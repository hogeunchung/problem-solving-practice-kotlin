package leetcode

class Solution2974 {

    fun numberGame(nums: IntArray): IntArray {
        val sortedNums = nums.sorted().toIntArray()
        for (i in 0 until nums.size / 2) {
            val tmp = sortedNums[2 * i]
            sortedNums[2 * i] = sortedNums[2 * i + 1]
            sortedNums[2 * i + 1] = tmp
        }

        return sortedNums
    }
}
