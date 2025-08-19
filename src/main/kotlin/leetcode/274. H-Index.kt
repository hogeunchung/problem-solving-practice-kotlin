package leetcode

fun hIndex(citations: IntArray): Int {
    val n = citations.size
    val sortedCitations = citations.sorted()

    var result = 0
    for (i in n - 1 downTo 0) {
        val atLeastCount = n - i
        if (sortedCitations[i] >= atLeastCount) {
            result = atLeastCount
        }
    }

    return result
}
