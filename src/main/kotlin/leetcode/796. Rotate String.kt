package leetcode

fun rotateString(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false
    val n = s.length

    for (start in 0 until n) {
        var result = true
        for (idx in 0 until n) {
            if (s[(start + idx) % n] != goal[idx]) {
                result = false
                break
            }
        }

        if (result) return true
    }

    return false
}
