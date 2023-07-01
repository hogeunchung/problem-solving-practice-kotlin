package leetcode

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size

    if (m * n != r * c) return mat

    val result = Array(r) { IntArray(c) { 0 } }
    for (mi in 0 until m) {
        for (ni in 0 until n) {
            result[(mi * n + ni) / c][(mi * n + ni) % c] = mat[mi][ni]
        }
    }

    return result
}
