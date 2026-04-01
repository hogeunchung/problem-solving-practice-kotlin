package leetcode

class Solution496 {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val nums2NumToIndexMap = nums2
            .mapIndexed { i, num -> num to i }
            .toMap()
        val nums2IndexToNumList = nums2
            .mapIndexed { i, num -> i to num }

        return nums1.map { num1 ->
            for (i in nums2NumToIndexMap[num1]!! + 1 until nums2.size) {
                val num2 = nums2IndexToNumList[i].second
                if (num2 > num1) return@map num2
            }

            return@map -1
        }.toIntArray()
    }
}
