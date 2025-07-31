package leetcode

fun commonChars(words: Array<String>): List<String> {
    val charCounts = words.map { word ->
        val charCountsPerWord = IntArray(26)
        word.forEach { char -> charCountsPerWord[char - 'a']++ }
        charCountsPerWord
    }

    val commonCharCounts = IntArray(26)
    (0 until 26).forEach {
        commonCharCounts[it] = charCounts.minOfOrNull { count -> count[it] }!!
    }

    val result = mutableListOf<String>()
    (0 until 26).forEach { idx ->
        if (commonCharCounts[idx] > 0) {
            repeat(commonCharCounts[idx]) { result.add(('a' + idx).toString()) }
        }
    }

    return result
}
