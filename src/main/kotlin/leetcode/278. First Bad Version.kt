package leetcode

// Given API, can't test.
fun isBadVersion(version: Int): Boolean {
    return true
}

fun firstBadVersion(n: Int): Int {
    var low = 1
    var high = n
    while (low <= high) {
        val mid = low + (high - low) / 2
        if (isBadVersion(mid)) {
            if (isBadVersion(mid - 1).not()) {
                return mid
            }
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return n
}
