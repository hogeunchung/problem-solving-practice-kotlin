package leetcode

class Solution1037 {

    fun isBoomerang(points: Array<IntArray>): Boolean {
        val x1 = points[0][0]
        val x2 = points[1][0]
        val x3 = points[2][0]

        val y1 = points[0][1]
        val y2 = points[1][1]
        val y3 = points[2][1]

        // area = 0.5 * abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
        return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) != 0
    }
}
