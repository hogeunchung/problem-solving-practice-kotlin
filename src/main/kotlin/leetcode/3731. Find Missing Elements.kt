package leetcode

class Solution3731 {

    fun findMissingElements(nums: IntArray): List<Int> {
        val minNum = nums.min()
        val maxNum = nums.max()

        val existence = BooleanArray(maxNum + 1)
        for (numIdx in 0 until nums.size) {
            existence[nums[numIdx]] = true
        }

        val missingNums = mutableListOf<Int>()
        for (num in minNum..maxNum) {
            if (existence[num].not()) {
                missingNums.add(num)
            }
        }

        return missingNums
    }
}
