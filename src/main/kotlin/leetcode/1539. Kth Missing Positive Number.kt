package leetcode

class Solution1539 {

    fun findKthPositive(arr: IntArray, k: Int): Int {
        val n = arr.size
        var arrIdx = 0
        var missingIdx = 0
        var curr = 1
        while (true) {
            if (arrIdx < n && curr == arr[arrIdx]) {
                arrIdx++
            } else {
                missingIdx++

                if (missingIdx == k) {
                    return curr
                }
            }

            curr++
        }
    }
}
