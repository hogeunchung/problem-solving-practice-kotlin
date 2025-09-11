package leetcode

fun secondHighest(s: String): Int {
    return s
        .filter { it in '0'..'9' }
        .toSet()
        .sortedDescending()
        .getOrNull(1)
        ?.digitToIntOrNull()
        ?: -1
}
