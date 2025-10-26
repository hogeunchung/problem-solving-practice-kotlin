package leetcode

class Solution1331 {

    fun arrayRankTransform(arr: IntArray): IntArray {
        val numToIndexMap = arr
            .toSet()
            .sorted()
            .mapIndexed { index, i -> i to index }
            .toMap()

        return arr
            .map { numToIndexMap[it]!! + 1 }
            .toIntArray()
    }
}
