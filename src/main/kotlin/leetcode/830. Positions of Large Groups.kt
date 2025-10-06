package leetcode

class Solution830 {

    fun largeGroupPositions(s: String): List<List<Int>> {
        val n = s.length
        val groupSizeThreshold = 3
        val result = mutableListOf<List<Int>>()

        var currGroupStartIdx = 0
        for (i in 0 until n) {
            if (s[currGroupStartIdx] != s[i]) {
                if (i - currGroupStartIdx >= groupSizeThreshold) {
                    result.add(listOf(currGroupStartIdx, i - 1))
                }
                currGroupStartIdx = i
            }
        }
        if (n - currGroupStartIdx >= groupSizeThreshold) {
            result.add(listOf(currGroupStartIdx, n - 1))
        }

        return result
    }
}
