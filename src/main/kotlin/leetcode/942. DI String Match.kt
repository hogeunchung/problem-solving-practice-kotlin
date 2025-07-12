package leetcode

fun diStringMatch(s: String): IntArray {
    val result = IntArray(s.length + 1)

    var lowerBound = 0
    var upperBound = 0
    for (i in 0 until s.length) {
        when (s[i]) {
            'I' -> result[i + 1] = ++upperBound
            'D' -> result[i + 1] = --lowerBound
            else -> throw IllegalArgumentException()
        }
    }

    return result.map { it - lowerBound }.toIntArray()
}
