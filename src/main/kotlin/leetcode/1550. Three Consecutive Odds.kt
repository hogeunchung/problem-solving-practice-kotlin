package leetcode

class Solution1550 {

    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var consecutiveOddCount = 0

        for (i in 0 until arr.size) {
            if (arr[i] % 2 == 1) {
                consecutiveOddCount++
                if (consecutiveOddCount >= 3) {
                    return true
                }
            } else {
                consecutiveOddCount = 0
            }
        }

        return false
    }
}
