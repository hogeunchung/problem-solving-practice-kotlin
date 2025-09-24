package leetcode

fun uniqueOccurrences(arr: IntArray): Boolean {
    val occurrence = mutableMapOf<Int, Int>()
    arr.forEach {
        occurrence[it] = occurrence.getOrDefault(it, 0) + 1
    }

    return occurrence.values.size == occurrence.values.toSet().size
}
