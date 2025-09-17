package leetcode

fun areOccurrencesEqual(s: String): Boolean {
    val occurrenceMap = mutableMapOf<Char, Int>()
    s.forEach { c ->
        occurrenceMap[c] = occurrenceMap.getOrDefault(c, 0) + 1
    }

    val count = occurrenceMap.values.first()
    return occurrenceMap.values.all { it == count }
}
