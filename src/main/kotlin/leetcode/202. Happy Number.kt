package leetcode

fun isHappy(n: Int): Boolean {
    val cache = mutableSetOf<Int>()
    var curr = n
    while (cache.contains(curr).not()) {
        if (curr == 1) return true
        cache.add(curr)

        var sum = 0
        while (curr > 0) {
            sum += (curr % 10) * (curr % 10)
            curr /= 10
        }

        curr = sum
    }

    return false
}
