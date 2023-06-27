package leetcode

fun maximumProduct(nums: IntArray): Int {
    val (positives, negatives) = nums.partition { it >= 0 }

    val candidates = mutableListOf<Int>()
    if (positives.size >= 3) {
        candidates.add(positives.sortedDescending().take(3).reduce { acc, i -> acc * i })
    }
    if (positives.size >= 1 && negatives.size >= 2) {
        candidates.add((listOf(positives.max()!!) + negatives.sorted().take(2)).reduce { acc, i -> acc * i })
    }
    if (positives.isEmpty() && negatives.size >= 3) {
        candidates.add(negatives.sortedDescending().take(3).reduce { acc, i -> acc * i })
    }

    return candidates.max()!!
}
