package leetcode

class Solution2315 {

    fun countAsterisks(s: String): Int {
        val words = s.split("|")

        return (0 until words.size)
            .filterIndexed { idx, _ -> idx % 2 == 0 }
            .sumOf { idx -> words[idx].count { it == '*' } }
    }
}
