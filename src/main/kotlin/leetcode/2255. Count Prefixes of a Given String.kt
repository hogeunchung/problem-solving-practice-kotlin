package leetcode

class Solution2255 {

    fun countPrefixes(words: Array<String>, s: String): Int {
        return words.count { word -> s.startsWith(word) }
    }
}
