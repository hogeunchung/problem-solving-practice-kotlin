package leetcode

fun replaceDigits(s: String): String {
    val n = s.length

    val result = StringBuilder()
    for (i in 0 until n / 2) {
        result.append(s[2 * i])
        result.append(s[2 * i] + s[2 * i + 1].digitToInt())
    }
    if (n % 2 == 1) {
        result.append(s[n - 1])
    }

    return result.toString()
}
