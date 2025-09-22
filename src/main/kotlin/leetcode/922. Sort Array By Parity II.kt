package leetcode

fun sortArrayByParityII(nums: IntArray): IntArray {
    val n = nums.size

    val result = IntArray(n)
    val (evenNums, oddNums) = nums.partition { it % 2 == 0 }

    for (i in 0 until n / 2) {
        result[2 * i] = evenNums[i]
        result[2 * i + 1] = oddNums[i]
    }

    return result
}
