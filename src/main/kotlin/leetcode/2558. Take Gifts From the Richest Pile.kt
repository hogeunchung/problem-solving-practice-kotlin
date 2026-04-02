package leetcode

import java.util.PriorityQueue
import kotlin.math.sqrt

class Solution2558 {

    fun pickGifts(gifts: IntArray, k: Int): Long {
        val minHeap = PriorityQueue<Int>()
        minHeap.addAll(gifts.map { -it })

        repeat(k) {
            minHeap.add(-sqrt(-minHeap.poll().toDouble()).toInt())
        }

        return -minHeap.sumOf { it.toLong() }
    }
}
