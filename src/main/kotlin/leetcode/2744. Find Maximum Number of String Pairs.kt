package leetcode

class Solution2744 {

    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        val n = words.size
        val reversedWords = words.map { it.reversed() }

        var result = 0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (words[i] == reversedWords[j]) {
                    result++
                }
            }
        }

        return result
    }
}
