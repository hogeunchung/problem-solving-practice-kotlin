package leetcode

import kotlin.math.min

class Solution3492 {

    fun maxContainers(n: Int, w: Int, maxWeight: Int): Int {
        return min(maxWeight / w, n * n)
    }
}
