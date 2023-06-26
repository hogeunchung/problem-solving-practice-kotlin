package leetcode

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxCount = 0
    var count = 0
    nums.map { num ->
        if (num == 0) {
            count = 0
        } else {
            count++
            if (maxCount < count) {
                maxCount = count
            }
        }
    }

    return maxCount
}
