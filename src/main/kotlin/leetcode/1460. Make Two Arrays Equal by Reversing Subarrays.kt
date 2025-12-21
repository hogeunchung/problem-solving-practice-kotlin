package leetcode

class Solution1460 {

    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        return target.groupBy { it } == arr.groupBy { it }
    }
}
