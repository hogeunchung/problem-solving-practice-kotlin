package leetcode

class Solution3005 {

    fun maxFrequencyElements(nums: IntArray): Int {
        val frequencyMap = nums
            .groupBy { it }
            .values
            .map { it.count() }
        val maxFrequency = frequencyMap.max()
        val numCountWithMaxFrequency = frequencyMap.count { it == maxFrequency }

        return maxFrequency * numCountWithMaxFrequency
    }
}
