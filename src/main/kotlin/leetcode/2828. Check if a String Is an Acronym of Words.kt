package leetcode

class Solution2828 {

    fun isAcronym(words: List<String>, s: String): Boolean {
        return words.map { it.first() }.joinToString("") == s
    }
}
