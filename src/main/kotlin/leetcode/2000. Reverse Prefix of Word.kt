package leetcode

fun reversePrefix(word: String, ch: Char): String {
    val firstChIdx = word.indexOfFirst { it == ch }
    return if (firstChIdx == -1) {
        word
    } else {
        word.take(firstChIdx + 1).reversed() + word.takeLast(word.length - firstChIdx - 1)
    }
}
