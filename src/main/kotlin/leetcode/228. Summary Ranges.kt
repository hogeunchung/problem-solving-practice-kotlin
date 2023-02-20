package leetcode

fun summaryRanges(nums: IntArray): List<String> {
    if (nums.isEmpty()) return emptyList()

    val ranges = mutableListOf<String>()
    var start = nums[0]
    
    for (i in nums.indices) {
        if (i == nums.size - 1) {
            ranges.add(toRange(first = start, last = nums[i]))
            break
        }

        if (nums[i + 1] - nums[i] == 1) {
            continue
        }

        ranges.add(toRange(first = start, last = nums[i]))
        start = nums[i + 1]
    }

    return ranges
}

private fun toRange(first: Int, last: Int) =
    if (first == last) {
        "$first"
    } else {
        "$first->$last"
    }

