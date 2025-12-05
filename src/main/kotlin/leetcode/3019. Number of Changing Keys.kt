package leetcode

class Solution3019 {

    fun countKeyChanges(s: String): Int {
        var currChar = s[0].lowercaseChar()
        var swapCount = 0
        for (i in 1 until s.length) {
            if (currChar != s[i].lowercaseChar()) {
                currChar = s[i].lowercaseChar()
                swapCount++
            }
        }

        return swapCount
    }
}
