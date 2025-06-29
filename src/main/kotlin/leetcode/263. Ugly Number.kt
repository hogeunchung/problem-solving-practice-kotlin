package leetcode

fun isUgly(n: Int): Boolean {
    if (n <= 0) return false

    var curr = n
    while (true) {
        if (curr % 5 == 0) {
            curr /= 5
            continue
        }
        if (curr % 3 == 0) {
            curr /= 3
            continue
        }
        if (curr % 2 == 0) {
            curr /= 2
            continue
        }

        break
    }

    return curr == 1
}
