package leetcode

fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val m = img.size
    val n = img[0].size

    val result = Array(m) { IntArray(n) }

    if (m == 1 && n == 1) return img
    if (m == 1) {
        val result = Array(m) { IntArray(n) }

        // end
        result[0][0] = (img[0][0] + img[0][1]) / 2
        result[0][n - 1] = (img[0][n - 2] + img[0][n - 1]) / 2

        // non-end
        for (ni in 1 until n - 1) {
            result[0][ni] = (img[0][ni - 1] + img[0][ni] + img[0][ni + 1]) / 3
        }

        return result
    }
    if (n == 1) {
        val result = Array(m) { IntArray(n) }

        // end
        result[0][0] = (img[0][0] + img[1][0]) / 2
        result[m - 1][0] = (img[m - 2][0] + img[m - 1][0]) / 2

        // non-end
        for (mi in 1 until m - 1) {
            result[mi][0] = (img[mi - 1][0] + img[mi][0] + img[mi + 1][0]) / 3
        }

        return result
    }

    // vertex
    result[0][0] = (img[0][0] + img[0][1] + img[1][0] + img[1][1]) / 4
    result[0][n - 1] = (img[0][n - 2] + img[0][n - 1] + img[1][n - 2] + img[1][n - 1]) / 4
    result[m - 1][0] = (img[m - 2][0] + img[m - 2][1] + img[m - 1][0] + img[m - 1][1]) / 4
    result[m - 1][n - 1] = (img[m - 2][n - 2] + img[m - 2][n - 1] + img[m - 1][n - 2] + img[m - 1][n - 1]) / 4

    // edge & non-vertex
    for (ni in 1 until n - 1) {
        result[0][ni] = (img[0][ni - 1] + img[0][ni] + img[0][ni + 1] +
                img[1][ni - 1] + img[1][ni] + img[1][ni + 1]) / 6
    }
    for (ni in 1 until n - 1) {
        result[m - 1][ni] = (img[m - 2][ni - 1] + img[m - 2][ni] + img[m - 2][ni + 1] +
                img[m - 1][ni - 1] + img[m - 1][ni] + img[m - 1][ni + 1]) / 6
    }
    for (mi in 1 until m - 1) {
        result[mi][0] = (img[mi - 1][0] + img[mi][0] + img[mi + 1][0] +
                img[mi - 1][1] + img[mi][1] + img[mi + 1][1]) / 6

    }
    for (mi in 1 until m - 1) {
        result[mi][n - 1] = (img[mi - 1][n - 2] + img[mi][n - 2] + img[mi + 1][n - 2] +
                img[mi - 1][n - 1] + img[mi][n - 1] + img[mi + 1][n - 1]) / 6
    }

    // non-vertex & non-edge
    for (mi in 1 until m - 1) {
        for (ni in 1 until n - 1) {
            result[mi][ni] = (img[mi - 1][ni - 1] + img[mi - 1][ni] + img[mi - 1][ni + 1] +
                    img[mi][ni - 1] + img[mi][ni] + img[mi][ni + 1] +
                    img[mi + 1][ni - 1] + img[mi + 1][ni] + img[mi + 1][ni + 1]) / 9
        }
    }

    return result
}
