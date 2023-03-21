package leetcode

fun reverseOnlyLetters(s: String): String {
    val reversedLetters = s
        .filter { it.isLetter() }
        .reversed()

    var idx = 0
    return s.map {
        if (it.isLetter()) {
            reversedLetters[idx++]
        } else {
            it
        }
    }.joinToString(separator = "")
}
