package leetcode

fun sortSentence(s: String): String {
    val wordWithIdxList = s.split(" ")
    val words = Array(wordWithIdxList.size) { "" }
    wordWithIdxList.map { wordWithIdx ->
        val idx = wordWithIdx.takeLast(1).toInt() - 1
        val word = wordWithIdx.take(wordWithIdx.length - 1)
        words[idx] = word
    }
    return words.joinToString(separator = " ")
}
