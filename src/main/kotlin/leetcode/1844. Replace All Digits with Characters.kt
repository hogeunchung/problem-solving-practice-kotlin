package leetcode

fun replaceDigits(s: String): String {
    return s.mapIndexed { i, c ->
        if (i % 2 == 0) {
            c
        } else {
            'a' - 1 + (c.digitToInt() + i)
        }
    }
        .joinToString("")
}
