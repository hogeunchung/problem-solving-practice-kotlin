package leetcode

class Solution941 {

    fun validMountainArray(arr: IntArray): Boolean {
        val n = arr.size
        var increased = false
        var decreased = false

        for (i in 0 until n - 1) {
            when {
                arr[i] < arr[i + 1] -> {
                    if (decreased) return false
                    increased = true
                }

                arr[i] > arr[i + 1] -> {
                    if (increased.not()) return false
                    decreased = true
                }

                else -> return false
            }
        }

        return increased && decreased
    }
}
