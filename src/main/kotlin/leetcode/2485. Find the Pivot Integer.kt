package leetcode

class Solution2485 {

    fun pivotInteger(n: Int): Int {
        val acc = IntArray(n + 1)
        for (i in 1..n) {
            acc[i] = acc[i - 1] + i
        }
        for (i in n downTo 1) {
            if (acc[i - 1] == acc[n] - acc[i]) {
                return i
            }
        }

        return -1
    }
}
