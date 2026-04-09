package leetcode

class Solution2220 {

    fun minBitFlips(start: Int, goal: Int): Int {
        return start.xor(goal).countOneBits()
    }
}
