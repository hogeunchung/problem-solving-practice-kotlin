package leetcode

class Solution933 {

    class RecentCounter() {

        val requests = mutableListOf<Int>()
        var idxOffset = 0

        fun ping(t: Int): Int {
            requests.add(t)
            var recentRequestCount = 1

            for (i in requests.size - 2 downTo idxOffset) {
                if (requests[i] < t - 3000) {
                    idxOffset = i + 1
                    break
                }

                recentRequestCount++
            }

            return recentRequestCount
        }
    }
}
