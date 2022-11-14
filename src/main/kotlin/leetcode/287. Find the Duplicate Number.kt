package leetcode

fun findDuplicate(nums: IntArray): Int {
    var a = 0
    var b = 0
    
    while (true) {
        a = nums[a]
        b = nums[nums[b]]

        if (a == b)
            break
    }

    a = 0

    while (true) {
        a = nums[a]
        b = nums[b]

        if (a == b)
            return a
    }
}
