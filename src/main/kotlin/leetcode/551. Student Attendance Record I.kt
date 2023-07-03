package leetcode

fun checkRecord(s: String): Boolean {
    var totalAbsentCount = 0
    var consecutiveLateCount = 0
    s.map {
        if (it == 'A') totalAbsentCount++
        if (it == 'L') consecutiveLateCount++
        else consecutiveLateCount = 0

        if (totalAbsentCount == 2) return false
        if (consecutiveLateCount == 3) return false
    }

    return true
}
