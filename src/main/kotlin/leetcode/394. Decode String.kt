package leetcode

fun decodeString(s: String): String {
    return decodeString(s = s, start = 0).first
}

private fun decodeString(s: String, start: Int): Pair<String, Int> {
    var curr = start
    val stringBuilder = StringBuilder()

    var k = 0
    while (curr < s.length) {
        when {
            '0' <= s[curr] && s[curr] <= '9' -> {
                k = k * 10 + (s[curr] - '0')
            }

            s[curr] == '[' -> {
                val (decoded, last) = decodeString(s = s, start = curr + 1)

                repeat(k) { stringBuilder.append(decoded) }
                k = 0
                curr = last
            }

            s[curr] == ']' -> break
            else -> stringBuilder.append(s[curr])
        }

        curr++
    }

    return stringBuilder.toString() to curr
}
