package leetcode

class Solution3184 {

    fun countCompleteDayPairs(hours: IntArray): Int {
        val n = hours.size
        val dailyHours = hours.map { it % 24 }
        var count = 0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if ((dailyHours[i] + dailyHours[j]) % 24 == 0) {
                    count++
                }
            }
        }

        return count
    }
}
