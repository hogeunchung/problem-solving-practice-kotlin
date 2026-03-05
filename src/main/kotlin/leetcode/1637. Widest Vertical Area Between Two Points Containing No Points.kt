package leetcode

import kotlin.math.max

class Solution1637 {

    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        val sortedXs = points
            .map { it.first() }
            .sorted()

        var maxWide = Int.MIN_VALUE
        for (i in 0 until sortedXs.size - 1) {
            maxWide = max(maxWide, sortedXs[i + 1] - sortedXs[i])
        }
        
        return maxWide
    }
}
