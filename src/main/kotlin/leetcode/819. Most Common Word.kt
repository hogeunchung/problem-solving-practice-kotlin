package leetcode

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    return paragraph
        .split(" ", "!", "?", "'", ",", ";", ".")
        .map { it.lowercase() }
        .map { it.filter { ch -> 'a' <= ch && ch <= 'z' } }
        .filterNot { it.isEmpty() }
        .filterNot { banned.contains(it) }
        .groupBy { it }
        .mapValues { it.value.size }
        .maxBy { it.value }
        .key
}
