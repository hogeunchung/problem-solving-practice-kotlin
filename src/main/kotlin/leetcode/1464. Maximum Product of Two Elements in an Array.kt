package leetcode

import java.util.PriorityQueue

class Solution1464 {

    fun maxProduct(nums: IntArray): Int {
        val priorityQueue = PriorityQueue<Int>()
        priorityQueue.addAll(nums.map { -it })

        return (-priorityQueue.poll() - 1) * (-priorityQueue.poll() - 1)
    }
}
