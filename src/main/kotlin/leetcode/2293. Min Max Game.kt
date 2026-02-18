package leetcode

import kotlin.math.max
import kotlin.math.min

class Solution2293 {

    fun minMaxGame(nums: IntArray): Int {
        var size = nums.size
        while (size > 1) {
            var isMin = true
            for (offset in 0 until size / 2) {
                val left = nums[2 * offset]
                val right = nums[2 * offset + 1]

                nums[offset] = if (isMin) min(left, right) else max(left, right)
                isMin = isMin.not()
            }
            size = size.shr(1)
        }

        return nums[0]
    }
}
