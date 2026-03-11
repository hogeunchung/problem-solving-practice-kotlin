package leetcode

class Solution303 {

    class NumArray(nums: IntArray) {

        private val _nums = nums

        fun sumRange(left: Int, right: Int): Int {
            return _nums.slice(left..right).sum()
        }
    }
}
