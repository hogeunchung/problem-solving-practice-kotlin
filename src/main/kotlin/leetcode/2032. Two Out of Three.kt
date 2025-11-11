package leetcode

class Solution2032 {

    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val totalCount = IntArray(101)
        val tempCount = IntArray(101)

        nums1.forEach { tempCount[it] = 1 }
        (1..100).forEach { totalCount[it] += tempCount[it] }
        clear(intArray = tempCount)

        nums2.forEach { tempCount[it] = 1 }
        (1..100).forEach { totalCount[it] += tempCount[it] }
        clear(intArray = tempCount)

        nums3.forEach { tempCount[it] = 1 }
        (1..100).forEach { totalCount[it] += tempCount[it] }
        clear(intArray = tempCount)

        return totalCount
            .mapIndexed { idx, i -> idx to i }
            .filter { it.second >= 2 }
            .map { it.first }
    }

    private fun clear(intArray: IntArray) {
        for (i in 0 until intArray.size) {
            intArray[i] = 0
        }
    }
}
