package leetcode

class Solution2951 {

    fun findPeaks(mountain: IntArray): List<Int> {
        val n = mountain.size
        val result = mutableListOf<Int>()

        var i = 1
        while (i < n - 1) {
            if (mountain[i - 1] < mountain[i] && mountain[i + 1] < mountain[i]) {
                result.add(i)
                i += 2
            } else {
                i += 1
            }
        }

        return result
    }
}
