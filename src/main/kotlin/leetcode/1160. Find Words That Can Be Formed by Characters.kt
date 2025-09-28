package leetcode

fun countCharacters(words: Array<String>, chars: String): Int {
    val charCount = chars.toCountMap()

    return words
        .filter { word ->
            word.toCountMap().entries.all { (char, count) ->
                charCount[char] != null && charCount[char]!! >= count
            }
        }
        .sumOf { it.count() }
}

private fun String.toCountMap(): Map<Char, Int> {
    return this
        .groupBy { it }
        .map { it.key to it.value.size }
        .toMap()
}
