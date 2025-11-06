package leetcode

import kotlin.math.min

class Solution1974 {

    fun minTimeToType(word: String): Int {
        val n = word.length
        var pointer = 'a'
        var move = 0
        for (i in 0 until n) {
            move += min((word[i] - pointer + 26) % 26, (-(word[i] - pointer) + 26) % 26)
            pointer = word[i]
        }

        return move + n
    }
}
