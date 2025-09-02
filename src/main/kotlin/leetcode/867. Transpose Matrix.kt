package leetcode

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val n = matrix.size
    val m = matrix[0].size

    val transposedMatrix = Array(m) { IntArray(n) }
    for (ni in 0 until n) {
        for (mi in 0 until m) {
            transposedMatrix[mi][ni] = matrix[ni][mi]
        }
    }

    return transposedMatrix
}
