package leetcode

class Solution1876 {

    fun countGoodSubstrings(s: String): Int {
        if (s.length <= 2) return 0

        var count = 0

        val charWindow = mutableListOf(s[0], s[1], s[2])
        if (charWindow.toSet().size == charWindow.size) count++

        for (i in 3 until s.length) {
            val first = charWindow[(i - 2) % 3]
            val second = charWindow[(i - 1) % 3]
            val third = s[i]

            if (first != second && second != third && third != first) {
                count++
            }

            charWindow[i % 3] = third
        }

        return count
    }
}
