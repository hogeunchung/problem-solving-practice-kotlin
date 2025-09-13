package leetcode

fun isPrefixString(s: String, words: Array<String>): Boolean {
    val n = words.size

    val concatenated = StringBuilder()
    for (i in 0 until n) {
        concatenated.append(words[i])

        if (concatenated.length > s.length) return false
        else if (concatenated.length == s.length) break
    }

    return concatenated.toString() == s
}
