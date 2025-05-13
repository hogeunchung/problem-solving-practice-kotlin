package leetcode

fun canJump(nums: IntArray): Boolean {
    val n = nums.size
    val jumpIndexes = ArrayDeque<Int>()
    val visits = BooleanArray(n)

    jumpIndexes.add(0)
    visits[0] = true
    while (jumpIndexes.isNotEmpty()) {
        val i = jumpIndexes.removeFirst()
        if (i == n - 1) {
            return true
        }

        for (j in 1..nums[i]) {
            if (i + j < n && visits[i + j].not()) {
                jumpIndexes.add(i + j)
                visits[i + j] = true
            }
        }
    }

    return false
}
