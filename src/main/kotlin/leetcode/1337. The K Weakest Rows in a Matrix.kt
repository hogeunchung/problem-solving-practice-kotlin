package leetcode

fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    return mat
        .map { it.sum() }
        .withIndex()
        .sortedBy { it.index }
        .sortedBy { it.value }
        .take(k)
        .map { it.index }
        .toIntArray()
}
