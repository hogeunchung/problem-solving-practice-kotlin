package leetcode

class Solution832 {

    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val n = image.size
        for (i in 0 until n) {
            for (j in 0 until n / 2) {
                val tmp = image[i][j]
                image[i][j] = image[i][n - 1 - j]
                image[i][n - 1 - j] = tmp
            }
            for (j in 0 until n) {
                image[i][j] = 1 - image[i][j]
            }
        }

        return image
    }
}
