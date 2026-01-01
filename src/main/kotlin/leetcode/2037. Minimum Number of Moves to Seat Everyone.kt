package leetcode

import kotlin.math.abs

class Solution2037 {

    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        val n = seats.size
        val sortedSeats = seats.sorted()
        val sortedStudents = students.sorted()

        var moveCount = 0
        for (i in 0 until n) {
            moveCount += abs(sortedSeats[i] - sortedStudents[i])
        }

        return moveCount
    }
}
