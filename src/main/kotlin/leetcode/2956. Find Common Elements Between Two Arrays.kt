package leetcode

class Solution2956 {

    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val intersection = nums1.toSet().intersect(nums2.toSet())

        return intArrayOf(
            nums1.count { intersection.contains(it) },
            nums2.count { intersection.contains(it) },
        )
    }
}
