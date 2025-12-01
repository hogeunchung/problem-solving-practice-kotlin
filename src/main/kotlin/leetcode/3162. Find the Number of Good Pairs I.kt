package leetcode

class Solution3162 {

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var result = 0
        for (i in 0 until nums1.size) {
            for (j in 0 until nums2.size) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    result++
                }
            }
        }

        return result
    }
}
