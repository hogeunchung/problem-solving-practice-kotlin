package leetcode

fun numOfStrings(patterns: Array<String>, word: String): Int {
    return patterns.filter { word.contains(it) }.size
}