package leetcode

class Solution1189 {

    fun maxNumberOfBalloons(text: String): Int {
        val textCharCounts = mutableMapOf<Char, Int>()
        text.forEach { char ->
            textCharCounts[char] = textCharCounts.getOrDefault(char, 0) + 1
        }

        val targetCharCounts = mapOf(
            'b' to 1,
            'a' to 1,
            'l' to 2,
            'o' to 2,
            'n' to 1,
        )

        return calculateCount(counts = textCharCounts, targetCounts = targetCharCounts)
    }

    private fun calculateCount(counts: MutableMap<Char, Int>, targetCounts: Map<Char, Int>): Int {
        var result = 0

        while (targetCounts.all { (char, count) -> counts.getOrDefault(char, 0) >= count }) {
            result++
            targetCounts.forEach { (char, count) ->
                counts[char] = counts.getOrDefault(char, 0) - count
            }
        }

        return result
    }
}
