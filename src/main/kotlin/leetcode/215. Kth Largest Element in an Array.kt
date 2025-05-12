package leetcode

import java.util.*

fun findKthLargest(nums: IntArray, k: Int): Int {
    val minHeap = PriorityQueue<Int>()
    minHeap.addAll(nums.map { -it })

    (0 until k - 1).forEach { _ -> minHeap.poll() }

    return -minHeap.poll()
}
