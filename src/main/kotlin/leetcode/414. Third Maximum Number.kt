package leetcode

import java.util.PriorityQueue

fun thirdMax(nums: IntArray): Int {
    val set = nums.toSet()
    if (set.size < 3) return set.max()

    val priorityQueue = PriorityQueue<Long>()
    priorityQueue.addAll(set.map { -it.toLong() })

    (0 until 2).forEach { _ -> priorityQueue.poll() }
    return -priorityQueue.poll().toInt()
}
