package leetcode

class Solution1450 {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        val n = startTime.size
        var count = 0
        for (i in 0 until n) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++
            }
        }

        return count
    }
}
