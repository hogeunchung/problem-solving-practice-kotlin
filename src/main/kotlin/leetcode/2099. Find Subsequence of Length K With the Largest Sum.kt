package leetcode

import java.util.PriorityQueue

fun maxSubsequence(nums: IntArray, k: Int): IntArray {
    val priorityQueue = PriorityQueue(
        Comparator<Pair<Int, Int>> { o1, o2 ->
            when {
                o1.first < o2.first -> -1
                o1.first > o2.first -> 1
                else -> when {
                    o1.second < o2.second -> -1
                    o1.second > o2.second -> 1
                    else -> 0
                }
            }
        })

    nums.forEachIndexed { i, num ->
        priorityQueue.add(-num to i)
    }

    return (0 until k)
        .map { priorityQueue.poll() }
        .sortedBy { it.second }
        .map { -it.first }
        .toIntArray()
}
