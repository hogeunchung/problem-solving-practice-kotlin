package leetcode

import kotlin.math.abs

class Solution3146 {

    fun findPermutationDifference(s: String, t: String): Int {
        val sMap = s.mapIndexed { index, ch -> ch to index }.toMap()
        val tMap = t.mapIndexed { index, ch -> ch to index }.toMap()

        return sMap
            .map { (ch, i) -> abs(i - tMap[ch]!!) }
            .sum()
    }
}
