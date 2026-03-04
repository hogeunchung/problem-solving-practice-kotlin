package leetcode

class Solution1689 {

    fun minPartitions(n: String): Int {
        return n
            .map { it.digitToInt() }
            .max()
    }
}
