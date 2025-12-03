package leetcode

class Solution2185 {

    fun prefixCount(words: Array<String>, pref: String): Int {
        return words.count { it.startsWith(pref) }
    }
}
