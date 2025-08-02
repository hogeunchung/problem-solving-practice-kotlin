package leetcode

fun freqAlphabets(s: String): String {
    val result = StringBuilder()
    var i = 0
    while (i < s.length) {
        when {
            s.getOrNull(i + 2) == '#' -> {
                result.append('a' + s.substring(i, i + 2).toInt() - 1)
                i += 3
            }

            else -> {
                result.append('a' + s.substring(i, i + 1).toInt() - 1)
                i++
            }
        }
    }

    return result.toString()
}
