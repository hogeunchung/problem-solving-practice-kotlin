package leetcode

fun licenseKeyFormatting(s: String, k: Int): String {
    val chars = s
        .filterNot { it == '-' }
        .uppercase()
        .toMutableList()

    if (chars.size <= k) return chars.joinToString("")

    for (i in chars.size - k downTo 1 step k) {
        chars.add(i, '-')
    }

    return chars.joinToString("")
}
