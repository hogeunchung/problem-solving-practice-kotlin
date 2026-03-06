package leetcode

class Solution3467 {

    fun transformArray(nums: IntArray): IntArray {
        val n = nums.size
        val transformed = IntArray(n)

        val oddCount = nums.count { it % 2 == 1 }
        for (i in n - 1 downTo n - oddCount) {
            transformed[i] = 1
        }

        return transformed
    }
}
