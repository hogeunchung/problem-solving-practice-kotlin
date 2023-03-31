package leetcode

fun truncateSentence(s: String, k: Int): String {
    return s.split(" ").take(k).joinToString(separator = " ")
}
