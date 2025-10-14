package leetcode

class Solution2942 {

    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        return words
            .mapIndexed { idx, word -> if (x in word) idx else null }
            .filterNotNull()
    }
}
