package leetcode

class Solution748 {

    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val licensePlateCharCountMap = licensePlate
            .asSequence()
            .filter { it in 'a'..'z' || it in 'A'..'Z' }
            .map { it.lowercaseChar() }
            .groupBy { it }
            .mapValues { it.value.size }

        return words
            .filter { word ->
                val wordCharCountMap = word.groupBy { it }.mapValues { it.value.size }
                licensePlateCharCountMap.all { (char, count) -> count <= (wordCharCountMap[char] ?: 0) }
            }
            .minBy { it.length }
    }
}
