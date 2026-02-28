package leetcode

class Solution3838 {

    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        return words
            .map { word -> word.sumOf { char -> weights[char - 'a'] } }
            .map { weightSum -> 'a' + 25 - weightSum % 26 }
            .joinToString("")
    }
}
