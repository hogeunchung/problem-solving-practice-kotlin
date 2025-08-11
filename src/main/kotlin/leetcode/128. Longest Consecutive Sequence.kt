package leetcode

import kotlin.math.max

fun longestConsecutive(nums: IntArray): Int {
    val visits = mutableMapOf<Int, Boolean>()
    nums.forEach { num -> visits[num] = true }

    var maxConsecutiveLength = 0
    visits.keys.forEach { num ->
        if (visits[num] != true) return@forEach

        var consecutiveLength = 1
        var curr = num - 1
        while (visits[curr] == true) {
            consecutiveLength++
            visits[curr] = false
            curr--
        }
        curr = num + 1
        while (visits[curr] == true) {
            consecutiveLength++
            visits[curr] = false
            curr++
        }
        maxConsecutiveLength = max(maxConsecutiveLength, consecutiveLength)
    }

    return maxConsecutiveLength
}
