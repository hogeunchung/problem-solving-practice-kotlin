package leetcode

class Solution1455 {

    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        sentence
            .split(' ')
            .forEachIndexed { idx, word ->
                if (word.startsWith(searchWord)) return idx + 1
            }

        return -1
    }
}
