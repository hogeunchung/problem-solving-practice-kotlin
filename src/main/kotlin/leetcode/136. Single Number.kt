package leetcode

fun singleNumber(nums: IntArray): Int {
    val unpairedSet = mutableSetOf<Int>()

    nums.map { num ->
        if (num in unpairedSet) {
            unpairedSet.remove(num)
        } else {
            unpairedSet.add(num)
        }
    }

    return unpairedSet.first()
}
