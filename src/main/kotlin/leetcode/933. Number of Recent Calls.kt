package leetcode

class Solution933 {

    class RecentCounter() {

        val requests = IntArray(10000)
        var currIdx = 0
        var idxOffset = 0

        fun ping(t: Int): Int {
            requests[currIdx++] = t

            for (i in currIdx - 2 downTo idxOffset) {
                if (requests[i] < t - 3000) {
                    idxOffset = i + 1
                    break
                }
            }

            return currIdx - idxOffset
        }
    }
}
