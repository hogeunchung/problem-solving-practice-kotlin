package leetcode

class Solution2798 {

    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        return hours.count { it >= target }
    }
}
