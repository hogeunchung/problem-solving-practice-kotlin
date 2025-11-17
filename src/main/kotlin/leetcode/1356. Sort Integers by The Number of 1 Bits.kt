package leetcode

class Solution1356 {

    fun sortByBits(arr: IntArray): IntArray {
        return arr
            .sorted()
            .sortedBy {
                var oneCount = 0
                var curr = it
                while (curr > 0) {
                    oneCount += curr and 1
                    curr = curr shr 1
                }
                oneCount
            }
            .toIntArray()
    }
}
