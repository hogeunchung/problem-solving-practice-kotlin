package leetcode

fun permute(nums: IntArray): List<List<Int>> {
    return permute(nums = nums.toList())
}

private fun permute(nums: List<Int>): List<List<Int>> {
    if (nums.isEmpty()) return listOf(emptyList())

    val permutations = permute(nums.slice(1..nums.size - 1))
    val result = mutableListOf<List<Int>>()

    permutations.forEach { permutation ->
        for (i in 0 until nums.size) {
            val permutationCopy = permutation.toMutableList()
            permutationCopy.add(i, nums[0])
            result.add(permutationCopy)
        }
    }

    return result
}
