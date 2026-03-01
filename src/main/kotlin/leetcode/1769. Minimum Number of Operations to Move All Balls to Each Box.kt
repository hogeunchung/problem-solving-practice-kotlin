package leetcode

import kotlin.math.abs

class Solution1769 {

    fun minOperations(boxes: String): IntArray {
        val n = boxes.length
        val result = IntArray(n)

        val indexesWithBall = boxes
            .mapIndexed { index, char -> index to char }
            .filter { (_, char) -> char == '1' }
            .map { (index, _) -> index }

        for (i in 0 until n) {
            indexesWithBall.forEach { indexWithBall ->
                result[i] += abs(i - indexWithBall)
            }
        }

        return result
    }
}
