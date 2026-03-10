package leetcode

class Solution2022 {

    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if (original.size != m * n) return emptyArray()

        val transformed = Array(m) { IntArray(n) }
        for (i in 0 until original.size) {
            transformed[i / n][i % n] = original[i]
        }

        return transformed
    }
}
