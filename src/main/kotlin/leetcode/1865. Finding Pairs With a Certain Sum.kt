package leetcode

class FindSumPairs(nums1: IntArray, nums2: IntArray) {

    private val _nums2 = nums2
    private val countMap1 = nums1.toCountMap()
    private val countMap2 = nums2.toCountMap()

    fun add(index: Int, `val`: Int) {
        val value = _nums2[index]
        _nums2[index] += `val`
        countMap2[value] = countMap2[value]!! - 1
        countMap2[value + `val`] = countMap2.getOrDefault(value + `val`, 0) + 1
    }

    fun count(tot: Int): Int {
        var result = 0
        for (key1 in countMap1.keys) {
            val value2 = countMap2[tot - key1]
            if (value2 != null) result += countMap1[key1]!! * value2
        }

        return result
    }

    private fun IntArray.toCountMap(): MutableMap<Int, Int> {
        val result = mutableMapOf<Int, Int>()
        this.forEach { num -> result[num] = result.getOrDefault(num, 0) + 1 }
        return result
    }
}
