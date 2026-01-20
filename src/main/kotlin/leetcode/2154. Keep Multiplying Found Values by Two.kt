package leetcode

class Solution2154 {

    fun findFinalValue(nums: IntArray, original: Int): Int {
        val numsSet = nums.toHashSet()

        var curr = original
        while (numsSet.contains(curr)) {
            curr *= 2
        }

        return curr
    }
}
