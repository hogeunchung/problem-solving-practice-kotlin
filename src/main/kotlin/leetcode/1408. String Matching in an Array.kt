package leetcode

fun stringMatching(words: Array<String>): List<String> {
    val sortedWords = words.sortedBy { it.length }
    val result = mutableListOf<String>()
    for (wi in 0 until sortedWords.size) {
        for (wj in wi + 1 until sortedWords.size) {
            if (isSubstring(sortedWords[wi], sortedWords[wj])) {
                result.add(sortedWords[wi])
                break
            }
        }
    }
    return result
}

fun isSubstring(shorterWord: String, longerWord: String): Boolean {
    for (li in 0..(longerWord.length - shorterWord.length)) {
        for (si in shorterWord.indices) {
            if (shorterWord[si] != longerWord[li + si]) break
            if (si == shorterWord.length - 1) return true
        }
    }
    return false
}
