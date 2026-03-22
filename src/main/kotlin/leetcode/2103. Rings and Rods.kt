package leetcode

class Solution2103 {

    fun countPoints(rings: String): Int {
        val colorBits = IntArray(10)

        for (i in 0 until rings.length / 2) {
            val ringIdx = rings[2 * i + 1].digitToInt()
            when (rings[2 * i]) {
                'R' -> colorBits[ringIdx] = colorBits[ringIdx].or(4)
                'G' -> colorBits[ringIdx] = colorBits[ringIdx].or(2)
                'B' -> colorBits[ringIdx] = colorBits[ringIdx].or(1)
            }
        }

        return colorBits.count { it == 7 }
    }
}
