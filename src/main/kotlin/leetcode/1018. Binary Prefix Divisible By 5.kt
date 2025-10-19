package leetcode

class Solution1018 {

    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val n = nums.size
        val result = MutableList(n) { false }

        for (i in 0 until n) {
            val mod5 = calcMod5(nums = nums, until = i)
            if (mod5 == 0) result[i] = true
        }

        return result
    }

    private fun calcMod5(nums: IntArray, until: Int): Int {
        var mod5 = 0
        for (i in until downTo 0) {
            val digitMod5 = when ((until - i) % 4) {
                0 -> 1
                1 -> 2
                2 -> 4
                3 -> 3
                else -> throw RuntimeException()
            }

            mod5 = (mod5 + digitMod5 * nums[i]) % 5
        }

        return mod5
    }
}
