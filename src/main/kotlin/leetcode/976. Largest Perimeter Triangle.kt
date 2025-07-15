package leetcode

fun largestPerimeter(nums: IntArray): Int {
    val n = nums.size
    val sortedNums = nums.sorted()

    for (i in n - 1 downTo 2) {
        for (j in i - 1 downTo 1) {
            for (k in j - 1 downTo 0) {
                if (sortedNums[i] < sortedNums[j] + sortedNums[k]) return sortedNums[i] + sortedNums[j] + sortedNums[k]
            }
        }
    }

    return 0
}
