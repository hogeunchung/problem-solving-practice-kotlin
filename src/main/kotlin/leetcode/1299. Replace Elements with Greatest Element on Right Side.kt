package leetcode

import kotlin.math.max

class Solution1299 {

    fun replaceElements(arr: IntArray): IntArray {
        val n = arr.size

        val rightGreatestArr = IntArray(n)
        rightGreatestArr[n - 1] = -1

        for (i in n - 2 downTo 0) {
            rightGreatestArr[i] = max(arr[i + 1], rightGreatestArr[i + 1])
        }

        return rightGreatestArr
    }
}
