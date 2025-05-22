package leetcode

import java.util.*
import kotlin.math.min

fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
    val queue = PriorityQueue(
        k,
        Comparator<Pair<Int, Int>> { o1, o2 -> -((o1.first + o1.second) - (o2.first + o2.second)) },
    )

    var queueSize = 0
    for (i in 0 until min(k, nums1.size)) {
        for (j in 0 until min(k, nums2.size)) {
            if (queueSize >= k) {
                if (nums1[i] + nums2[j] < queue.peek().let { it.first + it.second }) {
                    queue.poll()
                    queue.add(nums1[i] to nums2[j])
                }
            } else {
                queue.add(nums1[i] to nums2[j])
                queueSize++
            }
        }
    }

    return (1..k)
        .map { _ -> queue.poll().let { largest -> listOf(largest.first, largest.second) } }
        .reversed()
}
