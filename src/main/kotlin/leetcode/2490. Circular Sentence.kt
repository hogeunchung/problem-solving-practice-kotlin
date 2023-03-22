package leetcode

fun isCircularSentence(sentence: String): Boolean {
    val words = sentence.split(" ")
    for (i in words.indices) {
        if (words[i].last() != words[(i + 1) % words.size].first()) return false
    }

    return true
}
