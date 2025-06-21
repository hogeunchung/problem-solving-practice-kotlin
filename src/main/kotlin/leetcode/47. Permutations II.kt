package leetcode

fun permuteUnique(nums: IntArray): List<List<Int>> {
    val result = permute(nums = nums.toList())
    return result.toSet().toList()
}

private fun permute(nums: List<Int>): List<List<Int>> {
    if (nums.isEmpty()) return listOf(emptyList())

    val permutations = permute(nums.slice(1 until nums.size))
    val result = mutableListOf<List<Int>>()
    permutations.forEach { permutation ->
        for (i in 0..permutation.size) {
            val permutationCopy = permutation.toMutableList()
            permutationCopy.add(i, nums[0])
            result.add(permutationCopy)
        }
    }

    return result
}
