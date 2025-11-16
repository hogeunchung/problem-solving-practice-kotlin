package leetcode

import kotlin.math.min

class Solution1758 {

    fun minOperations(s: String): Int {
        var minDiffCount = Int.MAX_VALUE

        listOf('0', '1').forEach {
            var comp = it
            var diffCount = 0

            for (c in s) {
                if (c != comp) {
                    diffCount++
                }

                comp = if (comp == '0') '1' else '0'
            }

            minDiffCount = min(minDiffCount, diffCount)
        }

        return minDiffCount
    }
}
