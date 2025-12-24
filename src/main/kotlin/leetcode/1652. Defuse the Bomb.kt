package leetcode

class Solution1652 {

    fun decrypt(code: IntArray, k: Int): IntArray {
        val n = code.size
        val newCode = IntArray(n)

        if (k > 0) {
            for (i in 0 until n) {
                for (ki in 1..k) {
                    newCode[i] += code[(i + ki) % n]
                }
            }
        } else if (k < 0) {
            for (i in 0 until n) {
                for (ki in 1..-k) {
                    newCode[i] += code[(n + i - ki) % n]
                }
            }
        }

        return newCode
    }
}
