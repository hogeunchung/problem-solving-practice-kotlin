package leetcode

fun restoreString(s: String, indices: IntArray): String {
    val size = s.length
    val result = CharArray(size)
    (0 until size).map {
        result[indices[it]] = s[it]
    }
    return result.joinToString(separator = "")
}
