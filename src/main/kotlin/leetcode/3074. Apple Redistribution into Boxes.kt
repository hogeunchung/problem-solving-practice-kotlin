package leetcode

class Solution3074 {

    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        val appleCount = apple.sum()
        val descendingCapacities = capacity.sortedByDescending { it }

        var capacitySum = 0
        for (i in 0 until descendingCapacities.size) {
            capacitySum += descendingCapacities[i]

            if (capacitySum >= appleCount) {
                return i + 1
            }
        }

        return -1
    }
}
