package leetcode

class Solution3683 {

    fun earliestTime(tasks: Array<IntArray>): Int {
        return tasks.minOf { it[0] + it[1] }
    }
}
