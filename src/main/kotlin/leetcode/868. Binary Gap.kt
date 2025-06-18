package leetcode

import kotlin.math.max

fun binaryGap(n: Int): Int {
    var curr = n
    var maxDistance = 0
    var lastIdx: Int? = null
    var idx = 0

    while (curr > 0) {
        if (curr % 2 == 1) {
            if (lastIdx != null) {
                maxDistance = max(maxDistance, idx - lastIdx)
            }

            lastIdx = idx
        }

        curr /= 2
        idx++
    }

    return maxDistance
}
