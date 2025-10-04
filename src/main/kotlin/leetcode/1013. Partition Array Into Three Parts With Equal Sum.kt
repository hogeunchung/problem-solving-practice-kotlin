package leetcode

class Solution1013 {

    fun canThreePartsEqualSum(arr: IntArray): Boolean {
        val n = arr.size

        val accumulativeArr = IntArray(n)
        accumulativeArr[0] = arr[0]
        for (i in 1 until n) {
            accumulativeArr[i] = accumulativeArr[i - 1] + arr[i]
        }

        // [0, i), [i, j), [j, n)
        for (i in 1 until n - 1) {
            for (j in i + 1 until n) {
                val firstPartSum = accumulativeArr[i - 1]
                val secondPartSum = accumulativeArr[j - 1] - accumulativeArr[i - 1]
                val thirdPartSum = accumulativeArr[n - 1] - accumulativeArr[j - 1]

                if (firstPartSum == secondPartSum && secondPartSum == thirdPartSum) {
                    return true
                }
            }
        }

        return false
    }
}
