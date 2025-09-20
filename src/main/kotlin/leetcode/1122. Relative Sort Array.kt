package leetcode

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    val upperBound = 1001
    val indexes = IntArray(upperBound)
    val existences = BooleanArray(upperBound)
    for (i in 0 until arr2.size) {
        indexes[arr2[i]] = i
        existences[arr2[i]] = true
    }

    return arr1
        .sortedBy { if (existences[it]) indexes[it] else upperBound + it }
        .toIntArray()
}
