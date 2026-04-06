package leetcode

class Solution2085 {

    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val wordCountMap1 = words1.groupBy { it }.mapValues { it.value.count() }
        val wordCountMap2 = words2.groupBy { it }.mapValues { it.value.count() }

        val commonWords = wordCountMap1.keys.toSet().intersect(wordCountMap2.keys.toSet())

        return commonWords
            .count { word -> wordCountMap1[word] == 1 && wordCountMap2[word] == 1 }
    }
}
