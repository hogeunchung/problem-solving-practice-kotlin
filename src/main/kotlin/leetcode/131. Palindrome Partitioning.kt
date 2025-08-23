package leetcode

fun partition(s: String): List<List<String>> {
    val result = mutableListOf<List<String>>()
    val tempPartitioning = mutableListOf<String>()
    backtracking(s = s, startIdx = 0, tempPartitioning = tempPartitioning, result = result)

    return result
}

private fun backtracking(
    s: String,
    startIdx: Int,
    tempPartitioning: MutableList<String>,
    result: MutableList<List<String>>
) {
    val n = s.length
    if (startIdx == n) {
        result.add(tempPartitioning.toList())
    }

    for (endIdx in startIdx + 1..n) {
        if (isPalindrome(s = s, startIdx = startIdx, endIdx = endIdx)) {
            tempPartitioning.add(s.substring(startIndex = startIdx, endIndex = endIdx))
            backtracking(s = s, startIdx = endIdx, tempPartitioning = tempPartitioning, result = result)
            tempPartitioning.removeLast()
        }
    }
}

private fun isPalindrome(s: String, startIdx: Int, endIdx: Int): Boolean {
    for (i in 0 until (endIdx - startIdx) / 2) {
        if (s[startIdx + i] != s[endIdx - 1 - i]) {
            return false
        }
    }

    return true
}
