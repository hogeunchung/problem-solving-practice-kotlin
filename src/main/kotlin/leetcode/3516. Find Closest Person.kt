package leetcode

import kotlin.math.abs

class Solution3516 {

    fun findClosest(x: Int, y: Int, z: Int): Int {
        val distanceDiff = abs(z - x) - abs(z - y)

        return when {
            distanceDiff < 0 -> 1
            distanceDiff == 0 -> 0
            else -> 2
        }
    }
}
