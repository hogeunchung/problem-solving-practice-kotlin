package leetcode

import java.util.PriorityQueue

class Solution3264 {

    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        val priorityQueue = PriorityQueue(
            Comparator<Pair<Int, Int>> { o1, o2 ->
                if (o1.second == o2.second) o1.first - o2.first
                else o1.second - o2.second
            }
        )
        priorityQueue.addAll(nums.mapIndexed { index, num -> index to num })

        repeat(k) {
            val min = priorityQueue.poll()
            priorityQueue.add(min.first to min.second * multiplier)
        }

        return priorityQueue
            .sortedBy { it.first }
            .map { it.second }
            .toIntArray()
    }
}
