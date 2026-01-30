package leetcode

class Solution2391 {

    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        return listOf('M', 'P', 'G')
            .sumOf { calcTimeCost(garbage = garbage, travel = travel, type = it) }
    }

    private fun calcTimeCost(garbage: Array<String>, travel: IntArray, type: Char): Int {
        val latestTypeIdx = (garbage.size - 1 downTo 0)
            .firstOrNull { garbage[it].contains(type) }
            ?: return 0

        var timeCost = 0
        for (i in 0 until latestTypeIdx) {
            timeCost += travel[i] + garbage[i].count { it == type }
        }
        timeCost += garbage[latestTypeIdx].count { it == type }

        return timeCost
    }
}
