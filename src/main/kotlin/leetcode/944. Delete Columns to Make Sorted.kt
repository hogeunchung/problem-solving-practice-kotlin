package leetcode

class Solution944 {

    fun minDeletionSize(strs: Array<String>): Int {
        var result = 0
        for (j in 0 until strs[0].length) {
            for (i in 1 until strs.size) {
                if (strs[i][j] < strs[i - 1][j]) {
                    result++
                    break
                }
            }
        }

        return result
    }
}
