package leetcode

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val visits = BooleanArray(s.length)
    return helper(s = s, idx = 0, wordDict = wordDict, visits = visits)
}

private fun helper(s: String, idx: Int, wordDict: List<String>, visits: BooleanArray): Boolean {
    if (idx == s.length) return true
    if (visits[idx]) return false

    visits[idx] = true

    wordDict.forEach { word ->
        if (
            startsWith(s = s, idx = idx, word = word) &&
            helper(s = s, idx = idx + word.length, wordDict = wordDict, visits = visits)
        )
            return true
    }

    return false
}

private fun startsWith(s: String, idx: Int, word: String): Boolean {
    for (i in 0 until word.length) {
        if (idx + i >= s.length || s[idx + i] != word[i]) return false
    }

    return true
}
