package leetcode

fun search2(nums: IntArray, target: Int): Boolean {
    val valleyIdx = findValley(nums = nums, l = 0, r = nums.size - 1)
    if (valleyIdx == -1) return binarySearch(nums = nums, target = target, l = 0, r = nums.size - 1)

    return when {
        nums[valleyIdx] == target -> true
        nums[valleyIdx] < target -> binarySearch(nums = nums, target = target, l = valleyIdx + 1, r = nums.size - 1) ||
                binarySearch(nums = nums, target = target, l = 0, r = valleyIdx - 1)

        else -> false
    }
}

private fun findValley(nums: IntArray, l: Int, r: Int): Int {
    if (r <= l) return -1
    if (r > 0 && nums[r] < nums[r - 1]) return r
    if (l > 0 && nums[l] < nums[l - 1]) return l

    val mid = (l + r) / 2
    return when {
        nums[l] < nums[mid] -> findValley(nums = nums, l = mid + 1, r = r)
        nums[mid] < nums[r] -> findValley(nums = nums, l = l, r = mid)
        else -> findValley(nums = nums, l = l, r = r - 1)
    }
}

private fun binarySearch(nums: IntArray, target: Int, l: Int, r: Int): Boolean {
    if (r < l) return false

    val mid = (l + r) / 2
    return when {
        nums[mid] < target -> binarySearch(nums = nums, target = target, l = mid + 1, r = r)
        target < nums[mid] -> binarySearch(nums = nums, target = target, l = l, r = mid - 1)
        else -> true
    }
}
