package leetcode

fun majorityElement(nums: IntArray): Int {
    val m = mutableMapOf<Int, Int>()
    val bound = nums.size / 2
    nums.map { num ->
        if (m.containsKey(num).not()) m[num] = 0
        m[num] = m[num]!! + 1
        if (m[num]!! > bound) return num
    }

    return 0
}
