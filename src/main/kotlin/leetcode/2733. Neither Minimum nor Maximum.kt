package leetcode

import kotlin.math.max
import kotlin.math.min

class Solution2733 {

    fun findNonMinOrMax(nums: IntArray): Int {
        var minNum = Int.MAX_VALUE
        var maxNum = Int.MIN_VALUE

        nums.forEach { num ->
            minNum = min(minNum, num)
            maxNum = max(maxNum, num)
        }
        nums.forEach { num ->
            if (num != minNum && num != maxNum) {
                return num
            }
        }

        return -1
    }
}
