package leetcode

class Solution1684 {

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSet = allowed.toHashSet()

        var consistentCount = 0
        words.forEach { word ->
            if (word.any { char -> allowedSet.contains(char).not() }) return@forEach
            consistentCount++
        }

        return consistentCount
    }
}
